import java.util.*;
class length{
	public static void main(String args[]){		
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string - ");
   		String  str = sc.nextLine();		
		System.out.print("\nLength of the string is: "+str.length());
		String newstr=str.trim();		
		System.out.print("\nLength removing front and end spaces: "+newstr.length());
	}
}