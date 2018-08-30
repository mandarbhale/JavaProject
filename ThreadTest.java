
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. NewBorn
		Thread1 t1 = new Thread1("ONE");
		Thread1 t2 = new Thread1("TWO");
		Thread1 t3 = new Thread1("THREE");
		
		//2. Runnable..transition from new born to runnable using Start method
		
		//start add to queue...start is called only once...run is called by processor / scheduler
		//responsibility of thread scheduler to manage the run method
		
//		t1.setName("mandar");
//		t2.setName("raj");
//		t3.setName("akhilesh");
//		
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
		// 3. Running state
		
		// 4. Dead state - execution complete
		
		//Multithreaded processor based...if directly calling run method it will be normal class member execution
	}

}
