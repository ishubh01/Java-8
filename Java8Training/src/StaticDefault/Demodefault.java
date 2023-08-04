package StaticDefault;

public interface Demodefault {
	
	//static method
	static void run1() {
		System.out.println("this is static method");
	}

	//default method
	default void display() {
		
		System.out.println("this is Default methos method");
		
		//abstract method
		
	}
	abstract void run();
	
}
