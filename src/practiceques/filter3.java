package practiceques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class filter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> data= Arrays.asList(10,15,20,25,30,11,17,16,58,64,56,55);
		System.out.println(data);
		
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.addAll(data);
		List<Integer>  g6= list.stream().filter((n)->n>=50 && n<=60).toList();	
		System.out.println();
		System.out.println(g6);

	}

}
