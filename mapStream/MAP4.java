package mapStream;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MAP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> no= Arrays.asList(10,20,30,40);
		ArrayList<Integer> data= new ArrayList<Integer>();
	       data.addAll(no);
		System.out.println(data);
		 List<String> result= no.stream().map(String:: valueOf)
				 .collect(Collectors.toList());
				 System.out.println(result);
	}

}
