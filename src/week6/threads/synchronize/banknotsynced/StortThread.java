package week6.threads.synchronize.banknotsynced;

/**
 * StortThread stort geld op de BankRekening
 * 
 * unsychronized
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 *
 */
public class StortThread extends Thread {
    BankRekening rekening;
    double bedrag; // te storten bedrag

    public StortThread(BankRekening rekening, double bedrag) {
        this.rekening = rekening;
        this.bedrag = bedrag;
    }

    public void run() {
        for(int i = 0; i < 10000; i++)
        	rekening.stort(bedrag);
    }
}