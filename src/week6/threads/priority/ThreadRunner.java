package week6.threads.priority;

/**
 * ThreadRunner start de threads
 * We geven de ferrari en de mercedes threads verschillende priorities
 * In de output zie je wel de ferrari en de mercedes elkaar afwisselen, maar de ferrari komt veel meer
 * aan de beurt. Aan het einde is de ferrari al klaar en moet de mercedes nog een hoop meters maken.
 * 
 * Werkt niet zo goed op Mac
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 */
public class ThreadRunner {

	public static void main(String[] args) {

		// Maak threads
		RaceAuto ferrari = new RaceAuto("Ferrari", "F");
		RaceAuto mercedes = new RaceAuto("Mercedes", "M");
		
		// Zet de prioriteiten
		ferrari.setPriority(Thread.MAX_PRIORITY); 
		mercedes.setPriority(Thread.MIN_PRIORITY);
		
		// Start threads
		ferrari.start(); 
		mercedes.start();

	}

}
