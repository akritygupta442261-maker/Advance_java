package mapStream;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers= Arrays.asList(1,2,3,4);
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.addAll(numbers);
		
		System.out.println(numbers);
		System.out.println(data);
		List<Integer> result= data.stream()
				.map(n->n*n)
				.collect(Collectors.toList());
		//difference between tolist() and  collect(collector.toList() is we can add after
		result.add(25);

		System.out.println(result);
	}

}
