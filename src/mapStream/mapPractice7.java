package mapStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;




class Employee{
	public Employee(int eid, String name, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
	}
	int eid;
	String name;
	String dept;
}



public class mapPractice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Eployee> list= new AraryList<Employee>();
		list.add(new Employee(1."Ankit", "MCA"));
		list.add(new Employee(2."Amit", "MCA"));
		List<String> empNames= list
				.stream()
				.map(emp->emp.name)
				.toList.println(empNames);
		

		
		

	}

}
