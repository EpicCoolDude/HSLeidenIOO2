package week6.threads.synchronize.banksyncedwaitnotify;

/**
 * BankRekening beheert het saldo
 * 
 * sychronized; dat gaat goed
 * storten: 
 * 	- mag, als er geen opneem threads actief zijn (synchronized) 
 * 	- andere opneem threads moeten wachten tot de storting is gedaan.
 * 	- als storten klaar is: notifyAll om evt. wachtende opneem threads te activeren
 * opnemen: 
 * 	- mag, als er geen stort threads actief zijn (synchronized)
 * 	- als saldo negatief zou worden door opnemen: wachten to saldo weer positief is (wait)
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 */
public class BankRekening {
    double saldo = 0.0;

    public synchronized void stort(double bedrag) {
        if (bedrag < 0)
            throw new IllegalArgumentException(bedrag + "is negatief.");
        saldo = saldo + bedrag;
        System.out.println("BY: " + bedrag + " saldo: " + saldo);
        notifyAll(); // thread klaar: andere threads kunnen nu verder; bijv. een neemOp thread
    }

    public synchronized void neemOp(double bedrag) {
//    	System.out.println("neemOp() called");
    	
        if (bedrag < 0)
            throw new IllegalArgumentException(bedrag + "is negatief.");
        while(saldo < bedrag) {
            try{
                System.out.println("waiting");
                wait();
                System.out.println("stop waiting");
            }
            catch(InterruptedException e) {}
        }
        saldo = saldo - bedrag;
        System.out.println("AF: " + bedrag + " saldo: " + saldo);

    }

}