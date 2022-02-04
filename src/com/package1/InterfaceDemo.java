package com.package1;

public class InterfaceDemo extends InheritMethods {
	public static void main(String[] args) {
		InterfaceDemo i = new InterfaceDemo();
		i.m1();
		InheritMethods im = new InheritMethods();
		im.m1();
	}
}

final class Test13{
	void m1() {
		System.out.println("m1 Test13");
	}
}
