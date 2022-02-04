package com.package1;

public class CompileTimePoly {
	public static void main(String[] args) {
		CompileTimePoly c = new CompileTimePoly();
		c.wish();
		c.wish("jai");
		System.out.println(c.wish(20));
	}
	public void wish() {
		System.out.println("heloo ");
	}
	public void wish(String s) {
		System.out.println("hello "+s);
	}
	public int wish(int a) {
		return a+10;
	}
}
