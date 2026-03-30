package mapStream;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lang= Arrays.asList("Java","Python","C");
		
		ArrayList<String> newlang= new ArrayList<String>();
		newlang.addAll(lang);
		System.out.println(newlang);
		
		List<Character> result= lang.stream()
				.map(s->s.charAt(0))
				.collect(Collectors.toList());
		System.out.println(result);

	}

}
