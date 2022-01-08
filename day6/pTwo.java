package pTwo;
import pOne.*;
class Second extends First{
	int j=10;
	void m2(){
		m1();
		System.out.println("m2-method"+i);	
	}
	public static void main(String[] args){
		Second obj = new Second();
		System.out.println("pTwo package variable"+obj.j);
		obj.m2();
	}
}