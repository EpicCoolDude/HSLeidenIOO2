package week6.threads.extend;

/**
 * ThreadRunner start de threads
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 */
public class ThreadRunner {

	public static void main(String[] args) {

		// Maak threads
		RaceAuto ferrari = new RaceAuto("Ferrari", "F");
		RaceAuto mercedes = new RaceAuto("Mercedes", "M");
		
		// Start threads
		ferrari.start(); 
		mercedes.start();

	}

}
