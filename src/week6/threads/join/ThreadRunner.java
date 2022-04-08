package week6.threads.join;

/**
 * ThreadRunner start de threads
 * join(): nu gebruiken we ferrari.join()
 * Het programma start de ferrari thread. Normaal zou het programma dan doorlopen (terwijl de ferrari 
 * thread ook loopt. Dan zou dus vervolgens de mercedes thread gestart worden.
 * Echter :de ferrari.join() zorgt ervoor dat het programma (in feite de main() thread) nu wacht tot
 * de ferrari thread klaar is. Pas dan gaat het programma verder, en wordt de mercedes thread gestart.  
 * De mercedes thread wacht tot de ferrari thread klaar is
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 *
 */
public class ThreadRunner {

	public static void main(String[] args) {

		// Maak threads
		RaceAuto ferrari = new RaceAuto("Ferrari", "F", 100);
		RaceAuto mercedes = new RaceAuto("Mercedes", "M", 200);

		// Start ferrari thread
		System.out.println("De ferrari thread start. ");
		ferrari.start(); 
		// main thread wacht tot ferrari thread klaar is, en gaat dan pas verder, met mercedes thread
		// join zorgt ervoor dat de main thread blocked totdat de aangeroepen (ferrari) thread klaar is
		try{ 
			ferrari.join(); // haal het try-catch block met de join eens weg, en zie wat er dan gebeurt
		} catch (InterruptedException ie) {
			
		}
		System.out.println("De mercedes thread start. ");
		mercedes.start();
		
		// het programma loopt nu door naar de volgende regel code, terwijl de mercedes thread nog loopt
		System.out.println("Beide threads klaar?? Nog niet. ");


	}

}
