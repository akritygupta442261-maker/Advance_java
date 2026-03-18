package java15;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.function.Consumer;



record Student(int sid,String name, String cource) {};
public class MainRecords {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ENCAPSULATION SHORT FORM
//		Student s= new Student(1, "Student 1", "MCA");
//		System.out.println(s.sid());
//		System.out.println(s.name);
//		System.out.println(s.cource);
//		System.out.println(s);
		
		//FOR EACH  METHODS (not loop)
		int data[]= new int [] {89,25,56,45};
		//converting array to list
		//streeam means = converting stream data to object 
		List<Integer> listData= Arrays.stream(data).boxed().toList();
		listData.forEach((item)->System.out.println(item));;
		

	}

}
