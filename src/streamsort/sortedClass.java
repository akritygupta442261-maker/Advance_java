package streamsort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


import java.util.List;


 class Employee{
	 int name;
	 String dept ;
	 int eid;
	 int sallery;
	 /**
 	 * @param dept
 	 * @param eid
 	 * @param sallery
 	 */
	 public Employee(String dept, int eid, int sallery) {
		super();
		this.name= name;
		this.dept = dept;
		this.eid = eid;
		this.sallery = sallery;
	 }
	 
	 
	 
	 

	
}

public class sortedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list=  new ArrayList();
		list.add(new Employee(1,"Rahul", "IT", 20000));
		List<Employee>sorted= list.stream().sorted((e1,e2)->e1.sallery-e2.sallery).toList();
		System.out.println(sorted);
		
		sorted.forEach(System.out::println);
		
		
        

	}

}
