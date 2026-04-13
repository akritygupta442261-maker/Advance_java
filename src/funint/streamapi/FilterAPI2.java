<<<<<<< HEAD
package streamapi;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;//(all functional interface is inside it



public class FilterAPI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(23);
		list.add(45);
		list.addAll(List.of(23,45,67,21,56,77,52,66));
		System.out.println(list);
		// intermediate
		
//		Stream listStream= list.stream();

		list.stream().forEach((element)->System.out.print(element+" "));
		list.stream().filter(n->n>60).forEach((element)-> System.out.println(element));
		//short form
//		list.stream().forEach(System.out::println);
//		System.out.println("Count="+ list.stream().count());// fastest code of java by indexing- only new data is addressing, hasing
		System.out.println();
		System.out.println("Count="+ list.stream().filter((item)->item>50).count());
		


	}

}
=======
package streamapi;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;//(all functional interface is inside it



public class FilterAPI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(23);
		list.add(45);
		list.addAll(List.of(23,45,67,21,56,77,52,66));
		System.out.println(list);
		// intermediate
		
//		Stream listStream= list.stream();

		list.stream().forEach((element)->System.out.print(element+" "));
		list.stream().filter(n->n>60).forEach((element)-> System.out.println(element));
		//short form
//		list.stream().forEach(System.out::println);
//		System.out.println("Count="+ list.stream().count());// fastest code of java by indexing- only new data is addressing, hasing
		System.out.println();
		System.out.println("Count="+ list.stream().filter((item)->item>50).count());
		


	}

}
>>>>>>> 6fdbae08075c729a5a1974d6751cb93f4fd826da
