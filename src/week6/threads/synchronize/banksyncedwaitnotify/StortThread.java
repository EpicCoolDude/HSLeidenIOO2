package week6.threads.synchronize.banksyncedwaitnotify;

/**
 * StortThread stort geld op de BankRekening
 * 
 * BankRekening is sychronized
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 *
 */
public class StortThread extends Thread {
    BankRekening r;
    double b;

    public StortThread(BankRekening r, double b) {
        this.r = r;
        this.b = b;
    }

    public void run() {
        for(int i = 0; i < 100; i++) {
        	r.stort(b);
        	//System.out.println("BY: " + b + " saldo: " + r.saldo);
        }
        
    }
}