package enc;
import java.util.ArrayList;
import java.util.List;

   class Student {
	//three properties
	private String name;
	private String cource;
	private int sid;
	public Student(String name, String cource, int sid) {
		super();
		this.name = name;
		this.cource = cource;
		this.sid = sid;
	}
	//insilize by using constructor - right click- source- generate constructor using feilds, getter or setter method

	

	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public String getCource() {
		return cource;
	}
	
}

public class studentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentInfo=new ArrayList<Student>();
		studentInfo.add(new Student("Student1","MCA", 1));
		studentInfo.add(new Student("Student2","MCA", 2));

		studentInfo.add(new Student("Student3","MCA", 3));
		studentInfo.add(new Student("Student4","MCA", 4));
		studentInfo.add(new Student("Student5","MCA", 5));

		
		
		//s1.setSid(2);
		System.out.println("Student ID\t\tName\t\tCource");
		for(Student s:studentInfo) {
			String result=String.format("%d\t%s\t%",s.getSid(), s.getName());
			System.out.println(result);
			
		}

	}

}
