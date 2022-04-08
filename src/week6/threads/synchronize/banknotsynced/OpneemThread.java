package week6.threads.synchronize.banknotsynced;

/**
 * OpneemThread haalt geld van de BankRekening
 * 
 * unsychronized
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 */
public class OpneemThread extends Thread {
    BankRekening rekening;
    double bedrag; // op te nemen bedrag

    public OpneemThread(BankRekening rekening, double bedrag) {
        this.rekening = rekening;
        this.bedrag = bedrag;
    }

    public void run() {
        for(int i = 0; i < 10000; i++)
            rekening.neemOp(bedrag);
    }
}