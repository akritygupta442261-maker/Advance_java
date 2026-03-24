package StremeReduce;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class redEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list= Arrays.asList(10,20,30,40,50);
		int sum= list.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		//average
		System.out.println(sum);
		


	}

}
