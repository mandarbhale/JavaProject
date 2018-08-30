
public class RunnableDemo implements Runnable{
	
	private Thread thread;
	public RunnableDemo(String name) {
		
		thread = new Thread(this);
		thread.setName(name);
		thread.start();
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executing Thread..");
		System.out.println(thread.getName());
	}
	
	public static void main(String[] args) {
		new RunnableDemo("ONE");
		new RunnableDemo("TWO");
		new RunnableDemo("THREE");
		
		
//		t1.setName("Mandar");
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
//		System.out.println(t3.getName());
//		t1.start();
//		t2.start();
//		t3.start();
	
	}
}
