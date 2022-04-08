package week6.threads.sleep;

/**
 * ThreadRunner start de threads
 * 
 * @author Koen Warner
 * @version 1.0 31-01-2014
 * 
 */
public class ThreadRunner {

	public static void main(String[] args) {
		// Maak threads
		RaceAuto ferrari = new RaceAuto("Ferrari", "F", 100);
		RaceAuto mercedes = new RaceAuto("Mercedes", "M", 200);

		ferrari.start();
		mercedes.start();
	}

}
