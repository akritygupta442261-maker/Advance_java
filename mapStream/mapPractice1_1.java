package mapStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class mapPractice1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String > names=Arrays.asList("Sachin","Rahul", "Amit");
		System.out.println(names);
		ArrayList<String> list= new ArrayList<String>();
		list.addAll(names);
		
		List<String> result=  list.stream().
				map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);
		
		
		//List<String > result= names.stream()

	}

}
