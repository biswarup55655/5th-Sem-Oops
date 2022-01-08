import java.util.*;
class tempConversion{
	public static void main(String []args){
		System.out.println("Enter the temperature in degree  Fahrenheit: ");
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		double c = (f-32)/1.8;
		System.out.println( f+" degree  Fahrenheit = "+c+" degree celsius");
	}
}
