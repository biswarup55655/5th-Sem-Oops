interface first{
	public void m1();
	public void m2();
}
interface second{
	public void m3();
	public void m4();
}
interface third extends first,second{
	public void m5();
}
class abc{
	void display(){
		System.out.println("display method");
	};
}
class xyz extends abc implements third {
	public void m1(){
        	System.out.println("First Method of First Interface.");
    	};
    	public void m2(){
        	System.out.println("Second Method of First Interface.");
    	};
    	public void m3(){
        	System.out.println("First Method of Second Interface.");
    	};
    	public void m4(){
        	System.out.println("Second Method of Second Interface.");
    	};
    	public void m5(){
        	System.out.println("Method of Derived Interface.");
   	};
   	void m6(){
        	System.out.println("Method of Child Class.");
   	}
}
class Test1{
	public static void main(String[] args){
        xyz ob = new xyz();
        ob.m1();
        ob.m2();
        ob.m3();
        ob.m4();
        ob.m5();
        //ob.display();
        ob.m6();
    }
}