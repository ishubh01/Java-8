package MapFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
	
	public static void main(String[] args)
    {
        // making the array list object
//        ArrayList<String> fruit = new ArrayList<>();
//        fruit.add("Apple");
//        fruit.add("mango");
//        fruit.add("pineapple");
//        fruit.add("kiwi");
//        System.out.println("List of fruit-" + fruit);
//        
//        List list=fruit.stream().map(m->m.length()).collect(Collectors.toList());
//        
//        System.out.println(list);
		List<Integer> numbers = Arrays.asList(4, 5, 2, 7, 7, 3, 5);

		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		
		System.out.println(squaresList);
        
    }

}
