package MapFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
	public static void main(String[] args) {
		
		List<List> listOfListOfNumber = new ArrayList<>();
        listOfListOfNumber.add(Arrays.asList(2, 4));
        listOfListOfNumber.add(Arrays.asList(3, 9));
        listOfListOfNumber.add(Arrays.asList(4, 16));
        
        System.out.println("list of list : " + listOfListOfNumber);
        
        
        List listOfIntegers=(List) listOfListOfNumber.stream().flatMap(f->f.stream()).collect(Collectors.toList());
        
        System.out.println(listOfIntegers);
        
		
	}

}
