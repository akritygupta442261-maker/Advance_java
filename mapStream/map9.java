package mapStream;


import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class map9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> items= Arrays.asList("A", "B", "C");
		System.out.println(items);
		
		List<Integer> result= items.stream()
				.map(Integer::parseInt)
						.collect(Collectors.toList());
		System.out.println(result);


	}

}
