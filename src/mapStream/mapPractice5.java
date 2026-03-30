package mapStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class mapPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> itemss= Arrays.asList("A", "B","c");
		System.out.println(itemss);
		List<String> result= itemss.stream()
				.map(s->"Items-"+s).toList();
		System.out.println(result);
		
		//7
		
	

	}

}
