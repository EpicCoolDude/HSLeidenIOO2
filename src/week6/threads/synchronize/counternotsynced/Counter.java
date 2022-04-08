package week6.threads.synchronize.counternotsynced;

/**
 * Counter
 *
 * unsychronized; dat loopt door elkaar
 *
 * @author Koen Warner
 * @version	1.0 08-03-2016
 */
class Counter{
	// Class whose object will be shared

	public void increment(){

		for(int i = 1; i <= 5 ; i++){

			System.out.println(Thread.currentThread().getName() + " i = " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void decrement(){

		for(int i = 5; i > 0 ; i--){
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
	}
}
