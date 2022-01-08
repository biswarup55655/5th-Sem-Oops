class Parent{
	static{
		System.out.println("Block-1");
	}
	Parent(){
		System.out.println("Parent class-Constructor");
	}
	static{
		System.out.println("Block-2");
	}
}
class child extends Parent{
	static{
		System.out.println("Block-3");
	}
	child(){
		System.out.println("Child class-Constructor");
	}
	static{
		System.out.println("Block-4");
	}
	public static void main(String[]args){
		child obj = new child();
	}
}