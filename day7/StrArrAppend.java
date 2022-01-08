import java.util.*;
class StrArrAppend{
	public static void main(String args[]){	
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string - ");
		String str = sc.nextLine();
		System.out.println("Enter the character elements: ");		
		char[] a = sc.next().toCharArray();
      		System.out.println("Elements = ");
      		for (int i = 0; i < a.length; i++){
         		System.out.println(a[i]);
		}
		String concatinate=String.valueOf(a).concat(str);
		char [] res = concatinate.toCharArray();		
		for (int i = 0; i < concatinate.length(); i++){
         		System.out.println(res[i]);
		}
	}
}