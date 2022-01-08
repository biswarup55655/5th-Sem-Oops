class outerclass{
	public void m1(){
		System.out.println("This is outer class..");		
	}
	class innerclass{		
		public void m2(){
			System.out.println("This is inner class..");
			m1();
		}	
	}
}
class Test{
	public static void main(String[]args){
		//new outerclass().new innerclass().m2();
		outerclass ob =new outerclass();
		outerclass.innerclass ob1 = ob.new innerclass();
		ob1.m2();
	}
}
		