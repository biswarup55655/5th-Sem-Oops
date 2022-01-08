import java.util.*;
interface Shape{
	final double pie=3.14;
}
class Circle implements Shape{
	public double area(double r){
		return(pie*r*r);
 	}
}
class Rectangle implements Shape{
	public double area(double length,double breadth){
		return (length*breadth);
	}
}
class shapeArea{
	public static void main(String arg[]){
		double r,length,breadth;
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius-");
   		r=sc.nextDouble();
		System.out.print("Enter length-");
		length=sc.nextDouble();
		System.out.print("Enter breadth-");
		breadth=sc.nextDouble();
   		Circle c1=new Circle();
		System.out.println("Area of Circle:"+c1.area(r));
   		Rectangle r1=new Rectangle();   		
   		System.out.println("Area of Sphere:"+r1.area(length,breadth));
	}
}