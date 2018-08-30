
public class Thread1 extends Thread {
	
	
	public Thread1(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
		start();
	
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread.... " + i);
			System.out.println(getName());
			
			
			try {
				//Paused state
				//After pause it goes to running and not runnable
				sleep(1000);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
