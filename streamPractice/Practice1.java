package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(10,20,5,40,15,25);
	  
		//5 remove first 2 largest value and primt reamainingg
		  List result= list.stream().sorted(Comparator.reverseOrder()).skip(2).sorted().collect(Collectors.toList());
		  System.out.println(result);
		  
		  // 7 find the sum of no between 10 and 40
		  int sum= list.stream().filter(n->n>=10 && n<=40).mapToInt(Integer::intValue).sum();
		  System.out.println(sum);
		  
		  //9 converrt no into sq and print only top 4
//10 sum of smallest 4 -sort limit 
		  int sum2 = list.stream()
			        .sorted()        // sort ascending
			        .limit(4)        // take first 4 smallest numbers
			        .mapToInt(Integer::intValue)
			        .sum();

			System.out.println(sum2);
			
			//111 largest no after skipping the first 3 smallest no
		 
		 Optional<Integer> result1 = list.stream().sorted().skip(3).max(Integer::compareTo);
		 System.out.println(result1);
		 
		 //12 - find smallest odd no greater than 20
		
		 Optional<Integer> result2 = list.stream()
			        .sorted()
			        .filter(n -> n > 20 && n % 2 != 0)
			        .findFirst();
		 System.out.println(result2);
		 
		 //13 product of all no greater than 5
		 int product= list.stream()
				 .filter(n->n>5)
				 .reduce(1,(a,b)->a*b);
		 System.out.println(product);
		 
		 //14 -- sort the list, skip the first 2 smallest no , then find the minimum vale
		 Optional<Integer>  sort= list.stream().sorted().skip(2).min(Integer::compareTo);
		 System.out.println(sort);
		 
		 
		 //15 --find the maximum sq of odd no
//		 List sq= list.stream()
//				    .filter(n ->  n % 2 != 0)   // odd numbers
//				    .map(n->n*n)      // square
//				    .max(Integer::CompareTo);     // maximum
//		 System.out.println(sq);
//		 
		 
		 Optional<Integer> result4 = list.stream()
	                .filter(n -> n % 2 != 0)              // odd
	                .map(n -> n * n)                      // square
	                .sorted(Comparator.reverseOrder())   // sort descending
	                .findFirst();                         // first = max

	        result4.ifPresent(System.out::println);

	}

}
