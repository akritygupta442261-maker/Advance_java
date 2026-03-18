package java15;

public class MAinTextBlocl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("""package java10;\r\n"
				+ "\r\n"
				+ "public class MainVar {\r\n"
				+ "	 // instance variable not possible (var a;)\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		// TODO Auto-generated method stub\r\n"
				+ "		//var mans local variable type infrence\r\n"
				+ "		//var can't be instance variable \r\n"
				+ "		int a=10;\r\n"
				+ "		var b= 20;\r\n"
				+ "		var name= \"kiet mca\";\r\n"
				+ "		var value= 10.34;\r\n"
				+ "		//initilization must  \r\n"
				+ "		//null cant be initilize\r\n"
				+ "		/*var c;\r\n"
				+ "		c=10;*/\r\n"
				+ "		var c=0;\r\n"
				+ "		c=10;\r\n"
				+ "		\r\n"
				+ "	    String names= new String (\"This is string\");// object ko kkisi method k ander he banaya ja sakta hai\r\n"
				+ "		\r\n"
				+ "	    var names1 = new String(\"this is string with var\");\r\n"
				+ "	    int val[]= new int[] {25,65,85,26};\r\n"
				+ "	    for(var v: val) {\r\n"
				+ "	    	System.out.println(v);\r\n"
				+ "	    }\r\n"
				+ "		\r\n"
				+ "\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ """");
	}

}
