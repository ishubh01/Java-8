package SortingUsingLambda;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollectionLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer>a= new ArrayList<>();
		
		a.add(40);
		a.add(70);
		a.add(40);
		a.add(10);
		a.add(2);
		
		System.out.println("before sorting"+a);
		
		Collections.sort(a,(obj1,obj2)->(obj1>obj2)?-1:(obj1<obj2)?1:0);
		
		Collections.sort(a,(obj1,obj2)->(obj1>obj2)?1:(obj1<obj2)?-1:0);
		
		System.out.println("After Sorting"+ a);
	}
	
}