package MethodRefrencePractise;

public class DemoMethodReference {
	
	public static void anniversary(){
		
	System.out.println("Anniversary wishes");
	
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub//referring static method
	Wishes wish=DemoMethodReference::anniversary;
	
      //calling interface method
	 wish.birthday();
	 }
}
