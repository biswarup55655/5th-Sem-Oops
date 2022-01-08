import java.util.*;
class fibonacci{
	static int a=0,b=1,temp=0;
	static void printFibonacci(int n){
    	if(n>0){
        	temp = a + b;
        	a = b;
         	b = temp;
         	System.out.print(" "+temp);
         	printFibonacci(n-1);
     	}
}
public static void main(String args[]){
	System.out.print("Enter the range: ");
	Scanner sc =new Scanner(System.in);
	int range = sc.nextInt() ;
  	System.out.print(a+" "+b);
  	printFibonacci(range-2);
 	}
}