package StremeReduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class redEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//max element
		List <Integer> list= Arrays.asList(34,112,45,76,36,56,54,32);
		int max= list.stream().reduce(0, (a,b)->Integer.max(a, b));
		System.out.println(max);
		//count
		List <Integer> list1= Arrays.asList(34,112,45,76,36,56,54,32);
		int count= list1.stream().reduce(0, (a,b)->a+1);
		System.out.println(count);
		
		
		//sum of square 
	//2nd heighest
		int maxx= list1.stream().reduce(0, (a,b)->a>b?a:b);
		System.out.println("max"+maxx);
		
		int Smax= list.stream().reduce(0, (a,b)->a>b&&a<max?a:b);
		System.out.println("Smax"+Smax);
		
		//lowest
		int min= list1.stream().reduce(100, (a,b)->a<b?a:b);
		System.out.println("Min"+"Smin= "+min);
		int Smin= list.stream().reduce(100, (a,b)->a<b&&a>min?a:b);
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
