package com.package2;

public class ToString {
	int a = 420;
	String name = "Narayana";
	
	@Override
	public String toString() {
		return "ToString [a=" + a + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		System.out.println("hello bro ");
		ToString st = new ToString();
		System.out.println(st);
		
	}

}
