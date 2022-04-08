package week6.threads.synchronize.countersynced;

/**
 * Decrementer: het Counter object met 1 verminderen
 *
 * @author Koen Warner
 * @version	1.0 08-03-2016
 */
public class Decrementer extends Thread {

	Counter myCounter;

	public Decrementer(Counter counter) {

		this.myCounter = counter;
	}

	public void run() {
		myCounter.decrement();
	}
}