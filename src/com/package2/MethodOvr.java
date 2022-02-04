package com.package2;

public class MethodOvr {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A obj = new B();
		B b1 = (B)obj;
		  
		a.m1();
		a.m2();
		//a.m3();
		b.m1();
		b.m2();
		b.m3();
		obj.m1();
		obj.m2();
		b1.m3();
	}
}

class A{
	
	void m1() {
		System.out.println("m1 from A");
	}
	void m2() {
		System.out.println("m2 from A");
	}
}
class B extends A{
	void m1() {
		System.out.println("m1 from B");
	}
	void m2() {
		System.out.println("m2 from B");
		
	}
	void m3() {
		System.out.println("m3 from B");
	}
}