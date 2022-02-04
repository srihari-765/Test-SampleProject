package com.package1;

class Test01{
	int a;
	
	//default int e;
	
	private int b;
	protected int c;
	public int d;

	public static void main(String args[]){
		//Test01 test = new Test01();	
		B b =new Test01().new B();
		System.out.println(b.d);
	 }
	 class A{
		
		int a;
		//default int e;
		private int b;
		protected int c;
		public int d;

		void a(){
			int a ;
			//private int b;
			//protected int c;
			//public int d;
			//default int e;
			class B{}
			//private class B{}
			//protected class C{}
			//public class D{}
		}
		private void b(){
			int a;
			//private int b;
			
		}
		protected void c(){
			int a;
			//private int b;
		}
		public void d(){}
			
	}
	private class B{
		int a;
		private int b;
		protected int c;
		public int d = 10;
		
	}
	protected class C{}
	public class D{}
	//default class E{}
	void a(){
		int a ;
		//private int b;
		//protected int c;
		//public int d;
		//default int e;
		class A{}
		//private class B{}
		//protected class C{}
		//public class D{}
	
	}
	private void b(){
		//private int a;
	}
	protected void c(){}
	public void d(){}
	

}
