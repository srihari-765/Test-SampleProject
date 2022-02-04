package FactoryMethod;

public class NewInstance {
	public MobilePhoneInterface newInstance(String str) {
		if(str.equalsIgnoreCase("redmi"))
			return new Redmi();
		else if(str.equalsIgnoreCase("samsung"))
			return new Samsung();
		else if(str.equalsIgnoreCase("realme"))
			return new Realme();
		else return new Iphone();
			
	}
}
