import java.util.*;
class qstnAns{
	public static void main(String args[]){		
		System.out.print("Who is the inventor of Java");	
  		Scanner sc = new Scanner(System.in);
		System.out.print("-> ");
   		String  str1 = sc.nextLine();
		String answer= "James Gosling";
		int result=str1.compareTo(answer);
		if(result == 0){		
			System.out.print("\nGOOD");
		}else{
			System.out.print("\nTry again");
			System.out.print("-> ");
   			String  str2 = sc.nextLine();
			result=str2.compareTo(answer);
			if(result == 0){		
				System.out.print("\nGOOD");
			}else{
				System.out.print("\n Correct answer is James Gosling");
			}
		}		
	}
}