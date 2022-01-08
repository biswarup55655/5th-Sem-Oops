abstract class parent{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}
class child extends parent{
	public void m1(){
		System.out.println("C class in m1() method");
	}
	public void m2(){
		System.out.println("C class in m2() method");
	}
	/*public void m3(){
		System.out.println("C class in m3() method");
	}*/
}
class check{
	public static void main(String[]args){
		parent p=new child();
		p.m1();
		p.m2();
		//p.m3();
	}
}