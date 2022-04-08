package week6.threads.synchronize.banknotsynced;

/**
 * Bank met BankRekening en storters en opnemers(threads)
 * 
 * 
 * unsychronized BankRekening methods: dus de threads zitten elkaar in de weg Als je in totaal het zelfde bedrag opneemt
 * als dat je stort, dan zou je aan het einde op een saldo van 0.0 moeten uitkomen, maar dat gebeurt hier niet
 * 		1000 x 20,- storten 
		tweemaal 1000 x 10,- opnemen
 * 
 * @author Koen Warner
 * @version 1.0 31-01-2014
 */
public class Main {
	public static void main(String[] args) {
		BankRekening rek = new BankRekening();
		Thread t1 = new StortThread(rek, 20); // rekening, stortbedrag
		Thread t2 = new OpneemThread(rek, 10); // rekening, opneembedrag
		Thread t3 = new OpneemThread(rek, 10);
		t1.start();
		t2.start();
		t3.start();
		System.out.println();
		System.out.println(rek.saldo);
		
	}
}
