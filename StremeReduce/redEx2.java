package StremeReduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class redEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//2 Find product of all elements
		
		List<Integer>  listss= Arrays.asList(2,3,4,5);
		int product= listss.stream().reduce(1,(a,b)->a*b);
		System.out.println("product="+ product);  
		// maximum
		List<Integer>  list2= Arrays.asList(2,3,4,5);
		Optional<Integer> maximum= list2.stream().reduce((a,b)->a>b?a:b);
		System.out.println(maximum.get());
		
		//minimum

		
		Optional<Integer> min= list2.stream().reduce((a,b)->a<b?a:b);
		System.out.println(min.get());
		
		//Count total elements using reduce
		int count= list2.stream().reduce(0, (a,b)->a+1);
		System.out.println("cout="+count);
		
		//even no sum
		Integer even= list2.stream().filter(x->x%2==0).reduce(0,(a,b)->a+b);
		System.out.println("even="+even);
		
		
		//Convert list into single string
		List<String> ele= Arrays.asList("Java", "Stream", "API");
		String result= ele.stream().reduce("",(a,b)->a+b+"");
		System.out.println(result);
		
		//sum of square
		  
		int square= list2.stream().map(x->x*x).reduce(0,(a,b)->a+b);
		System.out.println("sq="+square);
		
		//2nd heighest
		
		int second= list2.stream().sorted((a,b)->b-a).skip(1).findFirst().get();
		System.out.println(second);
		
		//longest string
		 
		String given= ele.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
		System.out.println("Longest="+ given);
		
		//average usig reduce
		int sums=  list2.stream().reduce(0,(a,b)->a+b);
		double avg= (double)sums/list2.size();
		System.out.println(avg);
		

		
		
//		 
//		
		//max element
		List <Integer> list= Arrays.asList(34,112,45,76,36,56,54,32);
		int max= list.stream().reduce(0, (a,b)->Integer.max(a, b));
		System.out.println(max);
		
		
		//sum of square 
	//2nd heighest
		int maxx= list.stream().reduce(0, (a,b)->a>b?a:b);
		System.out.println("max"+maxx);
		
		int Smax= list.stream().reduce(0, (a,b)->a>b&&a<max?a:b);
		System.out.println("Smax"+Smax);
		
		//lowest
		int min2= list.stream().reduce(100, (a,b)->a<b?a:b);
		System.out.println("Min"+"Smin= "+min);
		int Smin= list.stream().reduce(100, (a,b)->a<b&&a>min2?a:b);
		System.out.println(Smin);
		
		
		//individual sum then total
		
		List <Integer> no= Arrays.asList(12,34,56,77);
		int totalSum= no.stream().reduce(0, (a,b)->a+(b%10)+(b-(b%10))/10);
		System.out.println(totalSum);
		
		//to string
		
		//“Write a Java program to find the sum of digits of a number using Stream API.”

		int value= 123456;
		 int rel= String.valueOf(value).chars().map(c->c-'0').reduce(0,(a,b)->a+b );
		System.out.println(rel);

		
		//find factorail using reduce
		List <Integer> LIST= Arrays.asList(1,2,3,4,5);

		int fact= LIST.stream().reduce(1,(a,b)->a*b );
		System.out.println("fact= "+ fact);
		
		//fact if value n=5
		
		int n=5;
		int factorial= IntStream.rangeClosed(1,n).reduce(1,(a,b)->a*b);
		System.out.println(factorial);
		
		

		


		


	}

}
