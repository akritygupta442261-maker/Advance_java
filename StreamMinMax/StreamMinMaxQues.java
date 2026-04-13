package StreamMinMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMinMaxQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(10,20,5,40,15);
		Optional<Integer> result = list.stream().min((a,b)->1);

		Optional<Integer> sorted= list.stream().min((a,b)->1);
		System.out.println(sorted);
		
		
		//3-distnict
		List<Integer> list3= Arrays.asList(10,20,10,30,20,40);

		List<Integer>  result3= list.stream().distinct().toList();
		System.out.println(result3);
		
		//6- 2nd smallest unit
		List<Integer> list6= Arrays.asList(10,20,10,30,20,40);
		//8 top 3 heighest no
		 
	
		

		
		

	}

	private static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}

}
