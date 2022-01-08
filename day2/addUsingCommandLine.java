import java.util.Scanner;
import java.io.*;
class addUsingCommandLine{
	public static void main(String[] args)throws IOException{
		int a,b,c,d,sum1,sum2;
		System.out.println("Enter first number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		sum1=a+b;
		System.out.println("Addition of two numbers is : "+sum1);

		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter first number");
		c = Integer.parseInt(obj.readLine());
               	System.out.println("Enter second number");
		d = Integer.parseInt(obj.readLine());
		sum2=c+d;
                System.out.println("Addition of two numbers is : "+sum2);
	}
}