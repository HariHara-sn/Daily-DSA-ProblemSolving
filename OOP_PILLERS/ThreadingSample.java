import java.security.KeyStore.Entry;
import java.util.HashSet;

class SharedResource {
    boolean flag = false;

    synchronized void produce() throws InterruptedException {
        while (flag) { 
            wait(); 
        }
        System.out.println(Thread.currentThread().getName() + " Producing...");
        flag = true;
        Thread.sleep(700); 
        notify(); // wake up consumer
    }

    synchronized void consume() throws InterruptedException {
        while (!flag) { // wait until producer produces
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " Consuming...");
        flag = false;
        notify(); // wake up producer
    }
}

class Producer extends Thread {
    SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                resource.produce();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadingSample {
    public static void main(String[] args) {
        // SharedResource resource = new SharedResource();

        // Producer producer = new Producer(resource);
        // Consumer consumer = new Consumer(resource);

        // producer.setName("Producer");
        // consumer.setName("Consumer");

        // producer.start();
        // consumer.start();
          String Str2 = "asdfghjkl";
          String Str3 = "alaska";
          System.out.println(Str2.contains(Str3));
        
    }
}
