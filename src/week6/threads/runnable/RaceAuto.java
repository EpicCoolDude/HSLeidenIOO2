package week6.threads.runnable;

/**
 * Een RaceAuto thread. Racet 100 meter. Laat zijn voortgang zien in aantal meters 
 * en in de lengte van zijn track.
 * In dit voorbeeld: RaceAuto implements de Runnable interface
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 *
 */
public class RaceAuto implements Runnable {
	
	private String naam;
	private String voortgangsKarakter;
	
	public RaceAuto(String naam, String voortgangsKarakter) {
		this.naam = naam;
		this.voortgangsKarakter = voortgangsKarakter;
	}
	
	/*
	 * Start de thread
	 */
	public void run(){
		// gebruikt om voortgang te tonen
		String voortgang = "";
		
		for (int i = 0; i < 100; i++){
			
			System.out.printf("\n%-8s - afstand: %3d ", naam, i);
			voortgang += this.voortgangsKarakter;
			System.out.printf("%s\n", voortgang);
		}
	}

}
