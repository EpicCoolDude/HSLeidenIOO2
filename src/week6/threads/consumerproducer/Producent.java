package week6.threads.consumerproducer;

/**
 * Producent stopt 'dingen' in de wachtrij
 * 
 * @author Koen Warner
 * @version 1.0 31-01-2014
 * 
 */
public class Producent extends Thread {
	private int wachttijd;
	private String producerId;
	private Wachtrij<String> rij;

	public Producent(String producerId, int wachttijd, Wachtrij<String> rij) {
		this.producerId = producerId;
		this.wachttijd = wachttijd;
		this.rij = rij;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(wachttijd);
			} catch (InterruptedException e) {
			}
			//System.out.println(producerId + " voegt toe: " + producerId + "." +i);
			rij.voegToe(producerId + "." +i);
		}
	}
}