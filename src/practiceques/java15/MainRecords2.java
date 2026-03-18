package java15;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;




record Student(int sid,String name, String cource) {};
public class MainRecords2{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//FOR EACH  METHODS (not loop)
		int data[]= new int [] {89,25,56,45};
		//converting array to list
		//streeam means = converting stream data to object 
		List<Integer> listData= Arrays.stream(data).boxed().toList();
	//	listData.forEach((item)->System.out.println(item));;
		listData.forEach(System.out::println);

	}

}
