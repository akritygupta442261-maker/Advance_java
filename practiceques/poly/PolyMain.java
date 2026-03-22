//package poly;
//
//class Animal{
//	String name;
//	String sound;
//	Animal(){//default const
//		this("Cow ","Mew ");
//	}
//	//constructor overloading
//	Animal(String name,String sound){
//		this.name=name;
//		this .sound=sound;
//	}
//	//String getInfo(int a) {//method overloading kvi v return type se nahi deekhta, 
//	//	return ""; //string is returning here
//	//}
//	void getInfo(String a ) {
//		System.out.println("Name="+name);
//		System.out.println("Sound="+ sound);
//	}
//	
//	void getInfo(String name, String sound, int legs) {
//		System.out.println("Name="+ name);
//		System.out.println("Sound=" +sound);
//		System.out.println("No of legs"+ legs);
//		
//	}
//}
//class Cat extends Animal{
//	//constructor
//	Cat(String name, String sound){
//		super(name,sound);
//	}
//	void getInfo() {
//		System.out.println(" Cat Name="+ name);
//		System.out.println("Cat Sound=" +sound);
//
//	}
//	
//	
//}
//public class PolyMain {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Animal an= new Animal("horse "," hinggs");
////		an.getInfo();
////		an.getInfo("Cow","Mew",4)
//		
//		Cat c1= new Cat("Cat2"," Mew");
//		c1.getInfo();
//
//	}
//
//}


package poly;

class Animal{
	 static String name;
	 static  String sound;
	Animal(){//default const
		this("Cow ","Mew ");
	}
	//constructor overloading
	Animal(String name,String sound){
		this.name=name;
		this .sound=sound;
	}
	//String getInfo(int a) {//method overloading kvi v return type se nahi deekhta, 
	//	return ""; //string is returning here
	//}
	 static void getInfo(String a ) {
		System.out.println("Name="+name);
		System.out.println("Sound="+ sound);
	}
	 static void getInfo(String name, String sound, int legs) {
		System.out.println("Name="+ name);
		System.out.println("Sound=" +sound);
		System.out.println("No of legs"+ legs);
	}
}
class Cat extends Animal{
	//constructor
	Cat(String name, String sound){
		super(name,sound);
	}
	void getInfo() {
		System.out.println(" Cat Name="+ name);
		System.out.println("Cat Sound=" +sound);
	}
}
public class PolyMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal an= new Animal("horse "," hinggs");
//		an.getInfo();
//		an.getInfo("Cow","Mew",4)
		Cat c1= new Cat("Cat2"," Mew");
		c1.getInfo();
		Animal c2= new Cat("Cat2","Mew");
		c2.getInfo();

	}

}

