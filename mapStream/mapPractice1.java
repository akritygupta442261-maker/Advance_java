package mapStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class mapPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= Arrays.asList("Sachin", "rahul","amit");
		System.out.println(names);
		List<String> result= names.stream().map(name->name.toUpperCase()).toList();
		System.out.println(result);

	}

}
