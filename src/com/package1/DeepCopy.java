package com.package1;
class Test11{
	int a;
	int b;
	@Override
	public String toString() {
		return "Test11 [a=" + a + ", b=" + b + "]";
	}
	
}
public class DeepCopy {
	public static void main(String[] args) {
		Test11 t1 = new Test11();
		t1.a = 100;
		t1.b = 200;
		System.out.println(t1);
		
		Test11 t2 = new Test11();
		t2.a = t1.a;
		t2.b = t1.b;
		System.out.println(t2);
		t2.a = 200000;
		t2.b = 300000;
		System.out.println(t1);
		System.out.println(t2);
	}
}
