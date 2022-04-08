package week6.threads.interrupt;

/**
 * ThreadRunner start de ferrari thread
 * De ferrari thread gaat runnen. In principe draait de ferrari thread oneidig door, met telkens een sleep() periode
 * Echter na 6 seconden roept ThreadRunner de stop() method van RaceAuto aan. In de stop() method van RaceAuto wordt
 * de sleep() van die thread interrupted. Daarmee stopt die thread
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 */
public class ThreadRunner {

	public static void main(String[] args) {

		// Maak RaceAuto objecten. Dit zijn zelf geen thread objecten: ze implementeren Runnable
		RaceAuto ferrari = new RaceAuto("Ferrari", "F", 100);
		
		// Roep start() aan op RaceAuto instantie. RaceAuto maak zelf een thread aan
		System.out.println("ThreadRunner starting ferrari...");
		ferrari.go();
		
		// Wacht 6 seconden...
		try {
			System.out.println("ThreadRunner sleeping ...");
			Thread.sleep(6000);
			System.out.println("ThreadRunner awake...");

		} catch (InterruptedException ie){
			
		}

		// ... en breek dan de race af; dit geeft een interrupt() in RaceAuto zelf
		System.out.println("ThreadRunner stopping ferrari...");
		ferrari.end();

	}

}
