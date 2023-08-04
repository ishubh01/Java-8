package StaticDefault;

public class DemoDefaultMethod implements Demodefault{

	public static void main(String[] args) {
		
		DemoDefaultMethod demoDefaultMethod=new DemoDefaultMethod();
		
		demoDefaultMethod.display();
		demoDefaultMethod.run();
		Demodefault.run1();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	System.out.println("abstract implemeted method");
	
}	}
