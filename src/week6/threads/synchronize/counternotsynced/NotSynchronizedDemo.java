package week6.threads.synchronize.counternotsynced;

/**
 * NotSynchronizedDemo
 *
 * unsychronized; dat loopt door elkaar
 *
 * @author Koen Warner
 * @version	1.0 08-03-2016
 */
public class NotSynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {

		// One object shared among both threads
		Counter ctr = new Counter();

		Incrementer incrementerThread = new Incrementer(ctr);
		Decrementer decrementerThread = new Decrementer(ctr);

		incrementerThread.start();
		decrementerThread.start();
	}
}