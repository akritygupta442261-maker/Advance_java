<<<<<<< HEAD
package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;




public class FilterAPI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data= Arrays.asList(25,58,65,47);
		System.out.println(data);
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(23);
		list.add(45);
		list.addAll(List.of(23,45,67,21,56,77,100,52,66,90,12,69));
		list.addAll(data);
		
		System.out.println(list);
		//Stream listStream= list.stream();
		list.stream().filter((n)->n>60).forEach((n)-> System.out.print(n+" "));	
		
		//if i dont want to print i want list
		List<Integer>  g60= list.stream().filter((n)->n>60).toList();	
		System.out.println();
		System.out.println(g60);
		
		//more than 60 but less than 90
		List<Integer>  g602= list.stream().filter((n)->n> 60 && n<90).toList();
		System.out.println();
		System.out.println(g602);



	}

}
=======
package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;




public class FilterAPI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data= Arrays.asList(25,58,65,47);
		System.out.println(data);
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(23);
		list.add(45);
		list.addAll(List.of(23,45,67,21,56,77,100,52,66,90,12,69));
		list.addAll(data);
		
		System.out.println(list);
		//Stream listStream= list.stream();
		list.stream().filter((n)->n>60).forEach((n)-> System.out.print(n+" "));	
		
		//if i dont want to print i want list
		List<Integer>  g60= list.stream().filter((n)->n>60).toList();	
		System.out.println();
		System.out.println(g60);
		
		//more than 60 but less than 90
		List<Integer>  g602= list.stream().filter((n)->n> 60 && n<90).toList();
		System.out.println();
		System.out.println(g602);



	}

}
>>>>>>> 6fdbae08075c729a5a1974d6751cb93f4fd826da
