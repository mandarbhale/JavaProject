
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. NewBorn
		Thread1 t = new Thread1();
		
		//2. Runnable..transition from new born to runnable using Start method
		
		//start add to queue...start is called only once...run is called by processor / scheduler
		//responsibility of thread scheduler to manage the run method
		t.start();
		
		// 3. Running state
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Method..." + i);
		}
		// 4. Dead state - execution complete
		
		//Multithreaded processor based...if directly calling run method it will be normal class member execution
	}

}
