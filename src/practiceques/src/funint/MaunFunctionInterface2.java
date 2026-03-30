package funint;

@
interface Calc{
	void calculate();
	
			 
	 }

public class MaunFunctionInterface2 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	           Add a= new Add() {
	        	   //Annanomus class

				@Override
				public int calculate(int n1, int n2) {
					// TODO Auto-generated method stub
					return (n1+n2);
				}
	        	   
	           };
	           System.out.println("Sum="+a.calculate(25, 50));
	           //use of functional interface-- (Lambda Expraction 
	           Add a1= (int n1, int n2)->(n1+n2);
	           System.out.println("Sum="+a.calculate(25, 50));
	           
	           
	           
		}


	}


