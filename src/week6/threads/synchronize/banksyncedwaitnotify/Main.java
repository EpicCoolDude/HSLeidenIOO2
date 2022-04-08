package week6.threads.synchronize.banksyncedwaitnotify;

/**
 * Bank met BankRekening en storters en opnemers(threads)
 * 
 * sychronized BankRekening methods: dus nu wachten de opneem thread tot hij mag opnemen
 * 
 * @author Koen Warner
 * @version 1.0 31-01-2014
 */
public class Main {
	public static void main(String[] args) {
		BankRekening r = new BankRekening();
		Thread t1 = new StortThread(r, 20);
		Thread t2 = new OpneemThread(r, 10);
		Thread t3 = new OpneemThread(r, 10);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t3.start();
		t1.start();

		try {
			t2.join();
			t3.join();
			t1.join();
		} catch (InterruptedException e) {
		}
		System.out.println();
		System.out.println("Eindsaldo: " + r.saldo);
	}
}
