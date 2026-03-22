package mref;
class Calculator{
	//constructor
	Calculator(){
		System.out.println("this is constructor");
	}
	Calculator(int n1, int n2){
		System.out.println("division="+(n1/n2));
	}
	//method
	int sub(int n1, int n2) {
		return n1-n2;
	}
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
		Calc c3=Calculator::new;
		//constructor by refrencing passing but it should not return type
		//it will match according to signature match int

		c3.cal(100, 20);
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

