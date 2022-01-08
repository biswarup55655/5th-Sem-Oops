import java.util.*;
class rupeesToPaise{
	public static void main(String []args){
		System.out.println("Enter the price of an item: ");
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		int paise =(int) (price*100);
		System.out.println(price+" rupees = "+paise+" paise");
	}
}