package week6.threads.interrupt;

/**
 * Een RaceAuto thread. Racet 100 meter. Laat zijn voortgang zien in aantal
 * meters en in de lengte van zijn track. In dit voorbeeld: RaceAuto implements
 * de Runnable interface
 * De RaceAuto thread wordt onderbroken door een interrupt() in de stop() method.
 * 
 * @author Koen Warner
 * @version 1.0 31-01-2014
 * 
 */
public class RaceAuto implements Runnable {

	private String naam;
	private String afstandsKarakter;
	private int sleepTime;
	private Thread myThread = null;

	public RaceAuto(String naam, String afstandsKarakter, int sleepTime) {
		this.naam = naam;
		this.afstandsKarakter = afstandsKarakter;
		this.sleepTime = sleepTime;
	}

	public void go() {
		System.out.println("RaceAuto being started...");

		if (myThread == null) {// check if thread is created
			myThread = new Thread(this);
			System.out.println("myThread: " + myThread); 
			
		}
		myThread.start();
	}

	public void end() {
		System.out.println("RaceAuto being stopped...");

		if (myThread != null) {
			myThread.interrupt();
		}
	}

	/*
	 * Start de thread. 
	 */
	public void run() {
		String voortgang = "";
		int i = 0;
		
		// De RaceAuto loopt door en moet af en toe wachten (sleep)
		// Totdat de thread wordt interrupted, dan stopt de RaceAuto
		while (!Thread.interrupted()) { // de sleep() wordt onderbroken

			System.out.printf("\n%-8s - afstand: %3d ", naam, i++);
			voortgang += this.afstandsKarakter;
			System.out.printf("%s\n", voortgang);

			try {
				// tanken of banden wisselen
				System.out.println("RaceAuto sleeping...");
				Thread.sleep(this.sleepTime);
				System.out.println("RaceAuto awake...");
			} catch (InterruptedException ie) {
				// laat de exception zien op console
				System.out.println("Race auto gestopt");
				ie.printStackTrace();
				break;
			}

		}

		myThread = null;

	}

}
