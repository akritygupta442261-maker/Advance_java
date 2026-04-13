<<<<<<< HEAD
package mref;
class Calculator{
	//constructor
	Calculator(){
		System.out.println("this is constructor");
	
	}
	// Instanc method
	int sub(int n1, int n2) {
		return n1-n2;
	}
	//static method
	static int mul (int n1, int n2) {
		return n1*n2;
	}
}
@FunctionalInterface
//signature should match - return type, parameter same
interface Calc{
	void cal(int n1, int n2);
}
public class methodRefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= new Calculator();
		int r= c.sub(100,20);
		System.out.println("substraction="+r);
		//instance variable
		//objectReference::method name
		Calc c1= c::sub;
		 int r1= c.sub(10, 20);
		 System.out.println("sub="+r1);
		 // for static method
		 //ClassName::method name
		 Calc c2=Calculator::mul;
		 int m1= c2.cal(100.5);
		 System.out.println("static code="+c2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		//constructor by refrencing passing but it should not return type
		//it will match according to signature match int


	}

}

//int r=c.sub(100,25);
//System.out.println("subtraction="+r);
//funct interface passing reference of method sum
//refrecing passing me () nahi laagata
//Calc c1= c::sub; //calc me sub chala gaya ,(sub ka signature {int cal(int n1, int n2);} match hona chahiya
//int s1= c1.cal(100,25 );
//System.out.println("subt"+s1);
//Calc c2= Calculator::mul;
//int m1=c2.cal(100, 25);
//System.out.println("multiplication="+m1);

=======
package mref;
class Calculator{
	//constructor
	Calculator(){
		System.out.println("this is constructor");
	
	}
	// Instanc method
	int sub(int n1, int n2) {
		return n1-n2;
	}
	//static method
	static int mul (int n1, int n2) {
		return n1*n2;
	}
}
@FunctionalInterface
//signature should match - return type, parameter same
interface Calc{
	void cal(int n1, int n2);
}
public class methodRefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= new Calculator();
		int r= c.sub(100,20);
		System.out.println("substraction="+r);
		//instance variable
		//objectReference::method name
		Calc c1= c::sub;
		 int r1= c.sub(10, 20);
		 System.out.println("sub="+r1);
		 // for static method
		 //ClassName::method name
		 Calc c2=Calculator::mul;
		 int m1= c2.cal(100.5);
		 System.out.println("static code="+c2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		//constructor by refrencing passing but it should not return type
		//it will match according to signature match int


	}

}

//int r=c.sub(100,25);
//System.out.println("subtraction="+r);
//funct interface passing reference of method sum
//refrecing passing me () nahi laagata
//Calc c1= c::sub; //calc me sub chala gaya ,(sub ka signature {int cal(int n1, int n2);} match hona chahiya
//int s1= c1.cal(100,25 );
//System.out.println("subt"+s1);
//Calc c2= Calculator::mul;
//int m1=c2.cal(100, 25);
//System.out.println("multiplication="+m1);

>>>>>>> 6fdbae08075c729a5a1974d6751cb93f4fd826da
