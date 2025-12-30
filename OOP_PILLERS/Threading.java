class SharedResource {
    private int data;
    private boolean hasData = false; // flag to control producer/consumer turn

    // synchronized method for Producer
    synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait if data is not yet consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // wake up the waiting consumer
    }

    // synchronized method for Consumer
    synchronized void consume() {
        // if flag is true then only you need to consume !
        while (!hasData) {
            try {
                wait(); // wait if no data is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // wake up the waiting producer
    }
}

class Producer extends Thread {
    private SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(5000); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(5000); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threading {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        producer.start();
        producer.setName("Producer");
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("All threads finished.");
    }
}

