class student {
	int roll;
	String name, stream, college;
	student(int roll, String name, String stream, String college){
		this.roll = roll;
		this.name = name;
		this.stream = stream;
		this.college = college;
	}
	void show() {

		System.out.println("roll = " + roll);
		System.out.println("name = " + name);
		System.out.println("stream = " + stream);
		System.out.println("college = " + college);
	}
	public static void main(String args[]){
		student ob1 = new student(01,"AAA","CSE","ZZZ");
		student ob2 = new student(02,"BBB","ECE","XXX");
		System.out.println("Student1 :-");
		ob1.show();
		System.out.println();
		System.out.println("Student2 :-");
		ob2.show();
	}
} 
