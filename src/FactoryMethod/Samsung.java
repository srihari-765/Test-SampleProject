package FactoryMethod;

public class Samsung implements MobilePhoneInterface {
	String company = "Samsung";
	String ram = "6GB";
	String processor = "Samsung 650";
	long price = 45000;
	
	@Override
	public void details() {
		System.out.println("company=" + company + ", \nram=" + ram + ", \nprocessor=" + processor + ", \nprice=" + price );		
		
	}

}
