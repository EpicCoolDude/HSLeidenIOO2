package week6.threads.consumerproducer;

import java.util.Vector;

/**
 * Een generieke wachtrij
 * 
 * @author Koen Warner
 * @version 1.0 31-01-2014
 * 
 */
public class Wachtrij<T> {
	private Vector<T> rij = new Vector<T>();

	public synchronized void voegToe(T s) {
		// achteraan toevoegen
		System.out.println("Wr: Producer voegToe() " + s);
		rij.add(s);
		System.out.println("Wr: notifyAll()");
		System.out.println("Wr: wachtrijlengte is " + this.lengte());
		notifyAll();
	}

	public synchronized T neemWeg() {
		// vooraan wegnemen - First in First out FIFO
		while (rij.isEmpty()) {
			try {
				System.out.println("Wr: Consumer start waiting...");
				wait();
				System.out.println("Wr: Consumer finished waiting...");
			} catch (InterruptedException e) {
			}
		}
		T s = rij.firstElement();
		System.out.println("Wr: Consumer neemWeg() " + s);
		rij.remove(s);
		System.out.println("Wr: Wachtrijlengte is " + this.lengte());
		return s;
	}

	public int lengte() {
		return rij.size();
	}
}