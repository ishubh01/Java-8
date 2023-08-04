package Anonymous;

public class TestGreeting {
	public static void main(String[] args) {
		
		MorningGreeting mg= new MorningGreeting() ;
		mg.greet();
		
		EveningGreeting eg= new EveningGreeting();
		eg.greet();
	}

}
