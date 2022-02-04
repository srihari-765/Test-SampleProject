package com.package1;

class Test10{
	int a =10;
	int b =20;
	@Override
	public String toString() {
		return "Test10 [a=" + a + ", b=" + b + "]";
	}
	
}
public class ShallowCopy {
	
	public static void main(String[] args) {
		Test10 t = new Test10();
		System.out.println(t);
		t.a=80;
		
		System.out.println(t);
		Test10 t1 = t;
		t1.a=200;
		t1.b=300;
		System.out.println(t1);
		System.out.println(t);
	}
}
