class Parent{
	void show(){
		System.out.println("parent");
 	}
	public static void main(String args[]) {
		Parent ob = new Parent();

      		Child1 ob1 = new Child1();
      		Child2 ob2 = new Child2();
     		Child3 ob3 = new Child3();

      		ob.show();
      		ob1.show();
      		ob2.show();
      		ob3.show();
  	}
}

class Child1 extends Parent{
	void show(){
    		System.out.println("parent1");
  	}
}
class Child2 extends Parent{
	void show() {
    		System.out.println("parent2");
  	}
}
class Child3 extends Parent{
	void show() {
    		System.out.println("parent3");
  	}
}