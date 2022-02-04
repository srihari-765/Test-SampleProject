package FactoryMethod;

public class Redmi implements MobilePhoneInterface {
	String company = "Redmi";
	String ram = "8GB";
	String processor = "SDM888";
	long price = 25000;
	
	@Override
	public String toString() {
		return "Redmi [company=" + company + ", ram=" + ram + ", processor=" + processor + ", price=" + price + "]";
	}

	@Override
	public void details() {
		System.out.println(toString());
		System.out.println("company=" + company + ", \nram=" + ram + ", \nprocessor=" + processor + ", \nprice=" + price );
		
		
	}
	
}
