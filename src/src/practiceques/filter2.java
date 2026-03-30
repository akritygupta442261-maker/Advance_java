package practiceques;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class filter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data= Arrays.asList("Amit", "Rave", "Anil", "Vikash", "Ashok", "Rahul");
		System.out.println(data);
		ArrayList<String> list= new ArrayList<String>();
		list.addAll(data);
		
		data.stream().filter(n->n.startsWith("A")).forEach(System.out::println);	
		
		
		
		
		


	}

}
