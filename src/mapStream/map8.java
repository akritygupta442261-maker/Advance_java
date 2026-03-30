package mapStream;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class map8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> no= Arrays.asList(10,20,30,40);
		System.out.println(no);
		
		List<Integer> result= no.stream()
				.map(n->n*2)
				.collect(Collectors.toList());
System.out.println(result);

	}

}
