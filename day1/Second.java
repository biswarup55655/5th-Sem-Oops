class Second{
	int x=99;
	void show(){
		System.out.println(x);
	}
}
class SecondTest{
	public static void main(String[]args){		
		Second obj=new Second();		
		obj.show();
	}
}