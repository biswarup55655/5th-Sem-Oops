class example{
	int x=10;
	int y=20;
void m1(){
	System.out.println("m1()");
}
void printxy(){
	System.out.println(x);
	System.out.println(y);
	m1();
	}
}
public static void main(string[] args){
	example ob=new example();
	ob.printxy();
}