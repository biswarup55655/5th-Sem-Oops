import java.util.Scanner;
public class primenumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		int range;
		for(int i = start ; i <= end ; i++){
			range = 0;
			for(int j = 1 ; j <= i ; j++){
				if(i % j == 0){
					range = range+1;
				}
			}
			if(range == 2){
				System.out.println(i);
			}
		}
	}
}