import java.util.*;
class stringToCharAr{
	public static void main(String args[]){		
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string - ");
   		String  str = sc.nextLine();		
		char[] ch = new char[str.length()];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == ' '){
				i++;
			}
			ch[i]=str.charAt(i);
		}
		for (char c : ch) {
            		System.out.println(c);
        	}
	}
}