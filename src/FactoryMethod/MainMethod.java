package FactoryMethod;

public class MainMethod {
	public static void main(String[] args) {
		NewInstance instance = new NewInstance();
		MobilePhoneInterface obj = instance.newInstance("redmi");
		obj.details();
		
		
	}
	
}
