package SortingUsingLambda;

import java.util.TreeSet;

public class DemoTreesetLambda {
	public static void main(String[] args) {
		
		
		TreeSet<String> ts=new TreeSet<String>((a,b)->b.compareTo(a));
		
		ts.add("r");
		ts.add("x");
		ts.add("a");
		
		for(String display:ts) {
			
			//desending order
			System.out.println(display);
		}
	}

}
