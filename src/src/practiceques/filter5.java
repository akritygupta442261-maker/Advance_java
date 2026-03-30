package practiceques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class filter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data= Arrays.asList( "Java", "Pythohn",null,"React",null);
		System.out.println(data);
		
		ArrayList<String> list=  new ArrayList<String>();
		list.addAll(data);
		List<String > notNullList= list.stream().filter(lang->lang!=null).toList();	
		
		System.out.println(notNullList);


	}

}
