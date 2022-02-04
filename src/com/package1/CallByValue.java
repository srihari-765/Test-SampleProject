package com.package1;

class Test06{
	int a = 100;
	int b = 200;
	int sum(int a, int b) {
		this.a =a;
		b = 2000;
		return a+b;
	}

}

public class CallByValue{
	public static void main(String[] args) {
		Test06 c = new Test06();
		System.out.println(c.sum(c.a, c.b));
		System.out.println(c.a+" "+c.b);
	}
}
