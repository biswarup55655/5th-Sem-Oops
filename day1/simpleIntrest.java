import java.util.*;
class simpleIntrest{
	public static void main(String[]args){
		double si,p,n,r;
		System.out.println("Enter the principle: ");
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		System.out.println("Enter the time in years: ");
		n = sc.nextInt();
		System.out.println("Enter the rate of intrest: ");
		r = sc.nextInt();
		si = (p*n*r)/100;
		System.out.println("Simple intrest = " + si);
	}
}