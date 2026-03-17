package streamapi;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class FilterApI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(23);
		list.add(45);
		list.addAll(List.of(23,45,67,21));
		System.out.println(list);
		//terminal operaion
		//aise objrct n banaya
//		Stream listStream= list.stream();
//		list.Stream().forEach((element)->System.out.println(element));
		list.stream().forEach((element)->System.out.print(element+" "));
		//short form
		list.stream().forEach(System.out::println);
		

		
		
		

	}

}
