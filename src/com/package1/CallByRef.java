package com.package1;

class Test07{
	int x;
	int y;
	void modify(Test07 ref) {
		ref.x = 10;
		ref.y = 20;
		System.out.println(x+" "+y);
	}
}

public class CallByRef{
	public static void main(String[] args) {
		Test07 obj = new Test07();
		System.out.println(obj.x+" "+obj.y);
		obj.x= 1000;
		obj.y = 2000;
		System.out.println(obj.x+" "+obj.y);
		obj.modify(obj);
		System.out.println(obj.x+" " +obj.y);
	}
}

