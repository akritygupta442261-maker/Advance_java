package StreamMinMax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;




public class StreamMIinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= Arrays.asList(12,1,4,100,200,150,45,67,99);
		List<Integer> sortedList= list.stream().sorted((a,b)->1).toList();
		System.out.println(list);
		System.out.println(sortedList);
		Optional<Integer> result = list.stream().min((a,b)->1);
		result.ifPresent(System.out::println);
		
		//max
		
		List<Integer> sortedList2= list.stream().sorted((a,b)->b-a).toList();
		System.out.println(list);
		System.out.println(sortedList2);
		Optional<Integer> result2 = list.stream().max((a,b)->b-a);
		result.ifPresent(System.out::println);


	}

}
