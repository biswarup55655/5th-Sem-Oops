import java.util.*;
class reverse{
	public static void main(String[]args){
		int m;
		int rev=0;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
			m=n%10;
			rev=rev*10+m;
			n=n/10;
		}
		System.out.println("sum of the seires :" + rev);
	}
}