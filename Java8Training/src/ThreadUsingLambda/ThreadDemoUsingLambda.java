package ThreadUsingLambda;

public class ThreadDemoUsingLambda {
	
	public static void main(String[] args) {
		

	
	Runnable runnable=()->{
		
		String ThreadName=Thread.currentThread().getName();
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
	};

	Thread thread1= new Thread(runnable);
	Thread thread2= new Thread(runnable);
	thread1.setName("Shubham");
	thread2.setName("Shubham");
	
	thread1.start();
	thread2.start();
	
	
	
	
}	}
