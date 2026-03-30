package StremeReduce;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list= Arrays.asList(34,112,45,76,36,56,54,32);
		int sum= list.stream().reduce(0,(a,b)->a+b);
		System.out.println("Sum="+ sum);
		//average
		
		int avg= sum/list.size();
		System.out.println("Avg="+avg);
		//average and sum in same line
		
		//List <Integer> list= Arrays.asList(34,112,45,76,36,56,54,32);
		int Average= list.stream().reduce(0,(a,b)->a+b)/list.size();
		System.out.println("Average="+avg);

	}

}
