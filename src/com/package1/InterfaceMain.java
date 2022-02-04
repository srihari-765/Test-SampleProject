package com.package1;

public class InterfaceMain implements InterfaceDemo2,InterfaceDemo3 {
	public static void main(String[] args) {
		InterfaceMain ifm = new InterfaceMain();
		ifm.m1();
		ifm.m2();
		ifm.m3();
	}

	@Override
	public void m1() {
		System.out.println("m1 from Main");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 from Main");		
	}

	@Override
	public void m3() {
		System.out.println("m3 from Main");
		InterfaceDemo3.super.m3();
	}
}
