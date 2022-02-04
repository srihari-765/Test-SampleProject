package com.package1;

class Test09{
	int x;
	int y;
	@Override
	public String toString() {
		return "Test09 [x=" + x + ", y=" + y + "]";
	}
	
}
public class ObjectCreation {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		Test09 t = new Test09();
		t.x = 100;
		t.y = 200;
		
		System.out.println(t);
		
		Class cl = Class.forName("com.package1.Test09");
		Test09 t1 = (Test09) cl.newInstance();
		System.out.println(t1);
		
	}
}
