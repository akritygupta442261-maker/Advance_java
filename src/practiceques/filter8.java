<<<<<<< HEAD
package practiceques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class filter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data= Arrays.asList( "Java", "Pythohn"," ","React"," ");
		System.out.println(data);
		
		ArrayList<String> list=  new ArrayList<String>();
		list.addAll(data);
		List<String> empty = data.stream().filter(n->n.isEmpty()).toList();
	
	
		
		System.out.println(empty);

	}

}
=======
package practiceques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class filter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data= Arrays.asList( "Java", "Pythohn"," ","React"," ");
		System.out.println(data);
		
		ArrayList<String> list=  new ArrayList<String>();
		list.addAll(data);
		List<String> empty = data.stream().filter(n->n.isEmpty()).toList();
	
	
		
		System.out.println(empty);

	}

}
>>>>>>> 6fdbae08075c729a5a1974d6751cb93f4fd826da
