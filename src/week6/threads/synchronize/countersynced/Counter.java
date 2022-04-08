package week6.threads.synchronize.countersynced;

/**
 * Counter
 *
 * sychronized; dat loopt goed
 *
 * @author Koen Warner
 * @version	1.0 08-03-2016
 */
public class Counter{
	// Class whose object will be shared

	public synchronized void  increment(){

		for(int i = 1; i <= 5 ; i++){

			System.out.println(Thread.currentThread().getName() + " i = " + i);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void  decrement(){
		for(int i = 5; i >= 1 ; i--){
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
	}
}
