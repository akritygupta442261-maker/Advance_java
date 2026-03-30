package StremeReduce;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class redEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data= Arrays.asList("java", "stream"," API" ,"reduce ");
		System.out.println(data);
		//
		
		String finalList= data.stream().reduce("",(a,b)->a+" "+b);
		System.out.println(finalList);
		
		//longest string
		String longest = data.stream()
                .reduce("", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(longest);
		//


		
		


	}

}
