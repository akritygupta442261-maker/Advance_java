package StreamMinMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class minMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List< Integer> list= Arrays.asList(10,50,30,80,20,90,40);
		List<Integer> result= list.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(result);
		
		//10 remove duplicate
		Optional<Integer> result2= list.stream().distinct().max((a,b)->a-b);
		System.out.println(result2);
		
		//11 skip 5 first element and print next 3 
		List <String> list2= Arrays.asList("Ram", "Shyam");
		Optional<Integer> result3= list.stream().min((a,b)->a.compareTo(b));
		result2.ifPresent(System.out::println);

				
	  // 13 maximum string
		
		//16
		
		
				
	}

}
