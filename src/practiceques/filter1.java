package practiceques;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class filter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data= Arrays.asList("sachin"," ", "mohit", "amit" ," ");
		System.out.println(data);
		//
		ArrayList<String> list= new ArrayList<String>();
		list.addAll(data);
		List<String> result= data.stream().filter(n->n.isEmpty()).toList();
		System.out.println(result);


	}

}
