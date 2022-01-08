import java.util.*;
class factorial{
	public int fact(int n){
		if(n==0 || n==1){
			return 1;
		}else{
			return (n*fact(n-1));
		} 	
		
	}
	public static void main(String[]args){
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factorial obj = new factorial();
		int factorial = obj.fact(n);		
		System.out.println("factorial of the number = " + factorial);
	}
}