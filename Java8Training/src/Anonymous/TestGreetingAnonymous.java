package Anonymous;

public class TestGreetingAnonymous {
public static void main(String[] args) {
	

	
		Greeting morningGreeting= new Greeting(){

			@Override
			public void greet() {
			System.out.println("good morning");
				
			}
		};
			
			Greeting eveningGreeting= new Greeting() {

				@Override
				public void greet() {
					System.out.println("good Evening");
					
				}
				
			};
			morningGreeting.greet();
			eveningGreeting.greet();
			
			
			
}	

}
