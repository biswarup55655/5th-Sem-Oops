class Student{	
	int roll;
	String name;
	String stream;
	String clg_name;

	Student(int roll,String name,String stream,String clg_name){
		this.roll=roll;
		this.name=name;
		this.stream=stream;
		this.clg_name=clg_name;
	}
	public static void main(String[] args){
		Student Id1 = new Student(14,"YYY","CSE","ACADEMY OF TECHNOLOGY");
		Student Id2 = new Student(15,"ZZZ","ECE","ACADEMY OF TECHNOLOGY");
		System.out.println("Information of First student:");
		System.out.println("  Name: "+Id1.name);
		System.out.println("  Roll: "+Id1.roll);
		System.out.println("  Stream: "+Id1.stream);
		System.out.println("  College: "+Id1.clg_name);
		System.out.println("Information of Second student:");
		System.out.println("  Name: "+Id2.name);
		System.out.println("  Roll: "+Id2.roll);
		System.out.println("  Stream: "+Id2.stream);
		System.out.println("  College: "+Id1.clg_name);
	}
}