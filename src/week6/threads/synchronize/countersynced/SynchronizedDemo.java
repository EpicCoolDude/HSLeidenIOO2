package week6.threads.synchronize.countersynced;

/**
 * NotSynchronizedDemo
 *
 * unsychronized; dat loopt goed
 *
 * @author Koen Warner
 * @version	1.0 08-03-2016
 */
public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {

		// One object shared among both threads
		Counter ctr = new Counter();

		Incrementer incrementerThread = new Incrementer(ctr);
		Decrementer decrementerThread = new Decrementer(ctr);

		incrementerThread.start();
		decrementerThread.start();
	}
}