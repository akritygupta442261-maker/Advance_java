package streamsort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;

public class sorted1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(25,56,15,25,36);
		System.out.println(list);
		
		 List<Integer> sortedList= list.stream().sorted((a,b)->b-a).toList();
	        System.out.println(sortedList);
	      //2  
	        List<Integer> sort= list.stream().sorted((a,b)->a-b).toList();
	        System.out.println(sort);
	        
	        //3
	        List<Integer> top3= list.stream().sorted((a,b)->b-a).limit(3).toList();
	        System.out.println(top3);	
	        //only even
	        
	        List<Integer> top3heighest= list.stream().sorted().skip(list.size()-3).toList();
	        System.out.println(top3heighest);
	        
	        //4 remove duplicate and store the result into new list using stream
	        
	        List<Integer> newList= list.stream().distinct().toList();
	        System.out.println("distnic=t"+newList);
	        
	        //7 sort and pring second heighest using stream
	        
	        Integer Secnd = list.stream().sorted(Comparator.reverseOrder())
	        		.toList().get(1);
	        System.out.println("Secnd="+Secnd);
	        
	        //8 sort the no greater than 20 using streawm sorted()
	        
	       // List<Integer> greaterThan20= list.stream().sorted((a,b)->a-b).(list.size()-20).toList;
	        
	        //10
	        List<String> names= Arrays.asList("ravi", "ankit", "zoya", "meena");
	        List<String> sortedelement= names.stream().sorted().toList();
	        System.out.println(sortedelement);
	        
	        //11 sort in reverse 
	        		
	        List<String> reverse= names.stream().sorted(Comparator.reverseOrder()).toList();
	        System.out.println(reverse);
	        //or
	        List<String> reverse2= names.stream()
	        		.sorted((a,b)->b.compareTo(a))
	        		.toList();
	        System.out.println(reverse2);
	        
	        //12 sort by length
	        
	        List<String> bylength= names.stream().sorted((a,b)->a.length()-b.length()).toList();
	        System.out.println(bylength);
	        
	        //13 sort only divisible by 5
	        
	        //14 smallest no
	        // 15 last 2 - decending and limit 2
	        //16 sort between 10 to 20 - 
	        //17 
	        List<Employee> lists= ArrayList(new Employee(1,"rahul",2000,"IT"));
	        

	        
	        

	}

}
