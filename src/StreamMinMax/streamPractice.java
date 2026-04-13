package StreamMinMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;
	public Object getDepartment;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    

//Sample ArrayList (used in questions)


@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", department="
				+ department + "]";
	}
}

public class streamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
		        new Employee(101, "Amit", 50000, 25, "IT"),
		        new Employee(102, "Neha", 60000, 28, "HR"),
		        new Employee(103, "Ravi", 45000, 24, "IT"),
		        new Employee(104, "Karan", 70000, 30, "Finance"),
		        new Employee(105, "Pooja", 55000, 27, "HR"),
		        new Employee(106, "Rohit", 80000, 32, "IT"),
		        new Employee(107, "Simran", 65000, 29, "Finance"),
		        new Employee(108, "Amit", 50000, 25, "IT")
		));
		Optional<Employee> result =empList.stream()
				.min((a,b)->(int)a.getSalary()-(int)b.getSalary());
				result.ifPresent(System.out::println);
		
				
				//max
				Optional<Employee> result2 =empList.stream()
						.max((a,b)->(int)a.getSalary()-(int)b.getSalary());
						result.ifPresent(System.out::println);
						
						//3
//						Optional<Employee> result3 =empList.stream()
//								.min((a,b)->Comparator.comparingDoublea().getSalary()-(int)b.getSalary());
//							result.ifPresent(System.out::println);
						
								//
				// 5- 2ND heighest sallery
							
							Employee result3= empList.stream()
									.sorted(Comparator.comparing(Employee::getSalary).reversed())
									.skip(1)
									.findFirst()
									.get();
							System.out.println(result3);
						
							
							//6 second lowest - only remove reverse
				//7  top 3 heighest   salary employee --sort, reverse , limit 3
							empList.stream()
							.sorted(Comparator.comparing(Employee::getSalary).reversed())
							.limit(3)
							.forEach(System.out::println);
							//9 remove duplicate employee based on  name
							
							 System.out.println("remved duplicate  in base of name");
		
							
							 empList.stream()
									.sorted(Comparator.comparing(Employee:: getSalary))
									.distinct()
									.forEach(System.out::println);
							 
							 //or // we make map here
							 empList.stream()
							 .collect(Collectors.toMap(Employee::getName,e->e,(e1,e2)->e1))
							 .values().forEach(System.out::println);
							 //10 remove duplicate based on salary 
							 System.out.println("remved duplicate  in base of salary");
							 //or

							 
							 empList.stream()
							 .collect(Collectors.toMap(Employee::getSalary,e->e,(e1,e2)->e1))
							 .values().forEach(System.out::println);
							 
							 //11 emplouee with the minimum salary in the IT department--- filter, sort/min,
							
							 System.out.println("min salary");
							 Optional<Employee> e = empList.stream()
								        .filter(emp -> "IT".equals(emp.getDepartment()))
								        .min(Comparator.comparingDouble(Employee::getSalary));

								System.out.println(e.get());
								
								//or
							Employee minSalary =	empList.stream()
								.filter((r)->r.getDepartment().equals("IT"))
								.min(Comparator.comparing(Employee::getSalary))
								.get();
								System.out.println(minSalary);
									
								//13 find minimum salary employee whose age is greater than 25
								System.out.println("min sal less than 25");
								Employee minSal= empList.stream()
										.filter((m)->m.getAge()>(25))
										.min(Comparator.comparingDouble(Employee::getSalary))
										.get();
								System.out.println(minSal);
								
								
								//14 max sal whose age is less than 30
								// 15 first 5 employee using stream API
								System.out.println("first 5 employee using stream API");
								empList.stream()
								.limit(5)
								.forEach(System.out::println);
								
								//16 skip the first 3 employee and print the remaining employee
								System.out.println("skip the first 3 employee and print the remaining");
								empList.stream()
								.skip(3)
								.forEach(System.out::println);
								
								//17 print the top 2 youngest employee
								System.out.println("print the top 2 youngest employee");
								 
								empList.stream()
								.sorted(Comparator.comparingInt(Employee::getAge))
								.limit(2) //multiple object hai to list me convert karni padti hai
								.forEach(System.out::println);
								
								//18  skip first 2 youngest emp and print the next 2 emp 
								
								System.out.println("skip first 2 youngest emp and print the next 2 emp ");
						
								empList.stream()
								.sorted(Comparator.comparing(Employee::getAge))
								.skip(2)
								.limit(2)
								.forEach(System.out::println);
								
								//19- print the top 3 heighest salary employee from the IT department
								
								System.out.println("Top 3 highest salary employees from IT:");

								empList.stream()
								       .filter(n -> n.getDepartment().equals("IT"))
								       .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
								       .limit(3)
								       .forEach(System.out::println);
								
								//20 remove duplicate employee names and print the first 5 employee
								
								
				
								
								
								
							

	}

}
