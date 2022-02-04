package com.package1;

class Test12 implements Cloneable{
	int x ;
	int y ;
	@Override
	public String toString() {
		return "Test12 [x=" + x + ", y=" + y + "]";
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Test12 t1 = new Test12();
		t1.x = 200;
		t1.y = 400;
		System.out.println(t1);
		
		Test12 t2 = (Test12) t1.clone();
		System.out.println(t2);
		
		t2.x = 100;
		t2.y = 300;
		System.out.println(t2);
	}

}
