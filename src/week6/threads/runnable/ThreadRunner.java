package week6.threads.runnable;

/**
 * ThreadRunner start de threads
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 */
public class ThreadRunner {

	public static void main(String[] args) {

		// Maak RaceAuto objecten. Dit zijn zelf geen thread objecten: ze implementeren Runnable
		RaceAuto ferrari = new RaceAuto("Ferrari", "F");
		RaceAuto mercedes = new RaceAuto("Mercedes", "M");
		
		// Maak threads en geeft de RaceAuto instanties mee als argument; de RaceAuto instanties
		// moeten een run() methode implementeren; die wordt door de JVM aangeroepen door start()
		Thread ferrariThread = new Thread(ferrari);
		Thread mercedesThread = new Thread(mercedes);
		mercedesThread.start();
		ferrariThread.start();

	}

}
