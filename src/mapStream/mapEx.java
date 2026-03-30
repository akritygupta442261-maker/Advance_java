package mapStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class mapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers= Arrays.asList(10,15,20,25,30,11,17,16,58,64,56,55);
		System.out.println(numbers);
		List<Integer> result= numbers.stream().filter(n->n<40).map(n->n+5).toList();
		System.out.println(result);
		


	}

}
