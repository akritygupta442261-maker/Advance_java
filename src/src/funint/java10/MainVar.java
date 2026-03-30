package java10;

public class MainVar {
	 // instance variable not possible (var a;)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var mans local variable type infrence
		//var can't be instance variable 
		int a=10;
		var b= 20;
		var name= "kiet mca";
		var value= 10.34;
		//initilization must  
		//null cant be initilize
		/*var c;
		c=10;*/
		var c=0;
		c=10;
		
	    String names= new String ("This is string");// object ko kkisi method k ander he banaya ja sakta hai
		
	    var names1 = new String("this is string with var");
	    int val[]= new int[] {25,65,85,26};
	    for(var v: val) {
	    	System.out.println(v);
	    }
		

	}

}
