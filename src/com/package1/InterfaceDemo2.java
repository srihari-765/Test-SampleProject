package com.package1;

public interface InterfaceDemo2 {
	void m1();
	void m2();
	default void m3() {
		System.out.println("m3 from Demo2");
	}
}
