package week6.threads.synchronize.countersynced;

/**
 * Incrementer: het Counter object met 1 vermeerderen
 *
 * @author Koen Warner
 * @version	1.0 08-03-2016
 */
public class Incrementer extends Thread {

	Counter myCounter;

	public Incrementer(Counter counter) {
		this.myCounter = counter;
	}

	public void run() {

		myCounter.increment();
	}
}