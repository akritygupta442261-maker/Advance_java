package calc;   //passing parameters in function , in constructor


class sum{
	int num1,  num2;
	 public sum(int num1,  int num2){
		this.num1=num1;  //num1, num 2 are same name so we use this 
		this.num2=num2;
	
	}
	 void getSum(){
		 int result= num1+num2;
		 System.out.println("sum =" +result);
		 }
}

class sub{
	void getsSub(int num1, int num2) {      // for local variable   //any local varia can't be call by object. 
		int s=num1-num2;                      // two value to pass any variable in -----1 throw constructor, - using instance variable
		 System.out.println("sub" +s);
		 
	
	}
	
}

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum s1=new sum(65, 55);
		s1.getSum();
		
		
		sub sub1= new sub();
		sub1.getsSub(44,36);

	}

}
