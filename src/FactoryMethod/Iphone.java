package FactoryMethod;

public class Iphone implements MobilePhoneInterface{
	String company = "Iphone";
	String ram = "4GB";
	String processor = "Apple400";
	long price = 125000;
	
	@Override
	public void details() {
		System.out.println("company=" + company + ", \nram=" + ram + ", \nprocessor=" + processor + ", \nprice=" + price );	}

}
