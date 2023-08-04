package MethodRefrencePractise;

public class DemoMethodreferenceInstace {
	
	public void anniversary()
	{
		System.out.println("Anniversary wishes in anniversary function");
		}

	public static void main(String[] args) {
// TODO Auto-generated method stub
      DemoMethodreferenceInstace dri=new DemoMethodreferenceInstace();
        Wishes wish=dri::anniversary;
           wish.birthday();}

}
