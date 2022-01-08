class Test{
	int a,b;
	Test(int a,int b){
		this.a=a;
		this.b=b;
	}
	void show1(Test x){
		System.out.println("a value =" + x.a +" b value = "+x.b);
	}
	void show2(A obj){
		System.out.println("a value =" + obj.x+" string s ="+obj.s);
	}
}

class A{
	int x;
	String s;
	A(int x,String s){
		this.x=x;
		this.s=s;
	}
}
class B{
	public static void main(String[] args){
		Test x=new Test(0,0);
		Test new_obj=new Test(1,2);
		A y=new A(3,"HELLO");
		x.show1(new_obj);
		x.show2(y);
	}
}
	