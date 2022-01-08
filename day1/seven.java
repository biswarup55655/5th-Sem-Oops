class A{
	int x,y;
	A(int x,int y){
		this.x=x;
		this.y=y;
	}
	A obj1(int x,int y){
		return new A(x,y);
	}
}
class B{
	A obj1(int x,int y){
		return new A(x,y);
	}
}
class Seven{
	public static void main(String[] args){
		A a=new B().m1(1,2);
		A b=new A(0,0).m1(3,4);
		System.out.println("X value ="+a.x+"y value ="+a.y);
		System.out.println("X value ="+b.x+"y value ="+b.y);
	}
}