package practiceques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class filter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <String> data= Arrays.asList("Java","python","C", "React", "C#", "Next.js", "Node.js");
		System.out.println(data);
		ArrayList<String> list= new ArrayList<String>();
		list.addAll(data);
		//length is greater than 4
		
		data.stream().filter(n->n.length()>=4).forEach(System.out::println);
		// remove all null values from list

	}

}
