import java.util.Scanner;
class HCF{
	public static void main(String args[]){
      		int num1, num2, hcf = 0;
      		Scanner sc = new Scanner(System.in);
      		System.out.println("Enter first number : ");
      		num1 = sc.nextInt();
      		System.out.println("Enter second number : ");
     		num2 = sc.nextInt();
		for(int i = 1; i <= num1 || i <= num2; i++) {
         		if( num1%i == 0 && num2%i == 0 )
         		hcf = i;
     		 }
		System.out.println("HCF of given two numbers is ::"+hcf);
   	}
}