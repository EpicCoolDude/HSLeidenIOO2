package week6.threads.join;

/**
 * Een RaceAuto thread. Racet 100 meter. Laat zijn voortgang zien in aantal meters 
 * en in de lengte van zijn track.
 * sleep(): De race auto stopt (sleep) af en toe om te tanken of banden te wisselen.
 * In dit voorbeeld: RaceAuto extends de Thread klasse
 * @author Koen Warner
 * @version	1.0 31-01-2014
 *
 */
public class RaceAuto extends Thread {
	
	private String naam;
	private String afstandsKarakter;
	private int sleepTime;
	
	public RaceAuto(String naam, String afstandsKarakter, int sleepTime) {
		this.naam = naam;
		this.afstandsKarakter = afstandsKarakter;
		this.sleepTime = sleepTime;
	}
	
	/*
	 * Start de thread
	 */
	public void run(){
		String voortgang = "";
		
		for (int i = 0; i < 100; i++){
			
			System.out.printf("\n%-8s - afstand: %3d ", naam, i);
			
			voortgang += this.afstandsKarakter;
			System.out.printf("%s\n", voortgang);
			
			try {
				// tanken of banden wisselen
				Thread.sleep(this.sleepTime);
			} catch (InterruptedException ie) {
				
			}
		}
	}

}
