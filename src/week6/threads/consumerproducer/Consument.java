package week6.threads.consumerproducer;

/**
 * Consumer haalt 'dingen' uit de wachtrij
 * 
 * @author Koen Warner
 * @version 1.0 31-01-2014
 * 
 */
public class Consument extends Thread {
	private String consumerId;
	private int wachttijd;
	private Wachtrij<String> rij;

	public Consument(String consumerId, int wachttijd, Wachtrij<String> rij) {
		this.consumerId = consumerId;
		this.wachttijd = wachttijd;
		this.rij = rij;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(wachttijd);
			} catch (InterruptedException e) {
			}
			String s = rij.neemWeg();
			//System.out.println(consumerId +  " neemt weg: " + s);

		}
	}
}