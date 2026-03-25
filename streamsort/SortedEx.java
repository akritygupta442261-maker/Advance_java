package streamsort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;
public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= Arrays.asList(25,56,15,25,36);
		System.out.println(list);
		
		//decending orfer
        List<Integer> sortedList= list.stream().sorted((a,b)->b-a).toList();
        System.out.println(sortedList);
        
        //ascending order
        List<Integer> sortedList1= list.stream().sorted((a,b)->a-b).toList();
        System.out.println(sortedList1);
        
        // not good but can be applicable fot decending order
        List<Integer> sortedList3= list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList);


	}

}
