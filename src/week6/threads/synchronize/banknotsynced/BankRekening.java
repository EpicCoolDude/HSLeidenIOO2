package week6.threads.synchronize.banknotsynced;

/**
 * BankRekening beheert het saldo
 * 
 * unsychronized; dat gaat mis
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 */
public class BankRekening {
    double saldo = 0.0;

    public void stort(double bedrag) {
        saldo = saldo + bedrag;
    }
  
    public void neemOp(double bedrag){
    	saldo = saldo - bedrag;
    }
}