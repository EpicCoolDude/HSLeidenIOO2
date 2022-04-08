package week6.threads.synchronize.banksyncedwaitnotify;

/**
 * OpneemThread haalt geld van de BankRekening
 * 
 * BankRekening is sychronized
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 */
public class OpneemThread extends Thread {
	BankRekening r;
	double b;

	public OpneemThread(BankRekening r, double b) {
		this.r = r;
		this.b = b;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			r.neemOp(b);
			//System.out.println("AF: " + b + " saldo: " + r.saldo);
		}
	}
}