import java.util.*;
class alphaOrder{
	void swap(char ch[],int len){
		char temp;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(ch[j]<ch[i]){
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}
	public static void main(String args[]){		
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string - ");
   		String  str = sc.nextLine();
		int n=str.length();		
		char ch[] = str.toCharArray();
		System.out.print("\nUnsorted-");
		System.out.print(str);	
		sort ob=new sort();		
		ob.swap(ch,n);
		System.out.print("\nSorted-");
		str = String.valueOf(ch);	
		System.out.print(str);		
	}
}