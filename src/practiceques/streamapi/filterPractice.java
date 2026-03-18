package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class filterPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// make a list which is of integer type
		List<Integer> data= Arrays.asList(10,15,20,25,30,11,17,16);
		System.out.println(data);
		//make a arraylist bcz (asList do not manuplate any data only update)
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.addAll(data);
		
		data.stream().filter(n->n%2 ==0).forEach(System.out::println);	
//		List<Integer>  even= list.stream().filter((n)->n%2==0).toList();	
		System.out.println();
		System.out.println(data);
		
		
		

	}

}
