import java.util.concurrent.locks.ReentrantLock;

class Printer {
	public void printPages(String doc, int pages) {
		System.out.println(doc + " " + pages);

	}
}

class MyThread extends Thread {
	Printer p;
	String d;
	int pages;

	public MyThread(Printer p, String doc, int pC) {
		this.p = p;
		this.d = doc;
		this.pages = pC;
	}

	public void run() {

	}
}

public class MainFunction {
	public static void main(String[] args) throws InterruptedException {

		Printer p = new Printer();
		// Printer p2= new Printer();
		String s1 = "CSE bookPage - ";
		MyThread t1 = new MyThread(p, s1, 25);
		t1.start();
		MyThread t2 = new MyThread(p, "SEEDDDDD bookPage - ", 5);
		t2.start();
		t2.run();
		
		ReentrantLock l = new ReentrantLock();
		l.lock(); 
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());
		l.unlock();


	}

}