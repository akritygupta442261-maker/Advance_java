/*package calc;


interface Area{
	double PI=3.14;
	double getArea();
}

class Circle implements Area{
	
	double r;
	Circle(double r){   //constructor
		this.r=r;
	}
	public double getArea() {
		return ( PI*r*r);
		
	}
}
public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1= new Circle(14.5);
		System.out.println("Area of circle"+ c1.getArea()+":");

	}

}*/

package calc;


interface Area{
	double PI=3.14;
	double getArea();
}

class Circle implements Area{
	
	double r;
	Circle(double r){   //constructor
		this.r=r;
	}
	public double getArea() {
		return ( PI*r*r);
		
	}


public void display() {
	System.out.println("Area of circle ="+this.getArea());
}
public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1= new Circle(14.5);
		//System.out.println("Area of circle"+ c1.getArea()+":");
		c1.display();
		
		
		Area c2= new Circle(15.5);
		Area r1= new Area() {//Annanomus class
			

			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				
				int l=10, b=40;
				return(l*b);
				
			}};
			System.out.println("Area of rectangle ="r1.getArea());
			
		}

	}


}


























