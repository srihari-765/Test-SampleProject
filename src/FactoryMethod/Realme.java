package FactoryMethod;

public class Realme implements MobilePhoneInterface {
	String company = "Realme";
	String ram = "4GB";
	String processor = "SDM450";
	long price = 12000;
	
	@Override
	public void details() {
		System.out.println("company=" + company + ", \nram=" + ram + ", \nprocessor=" + processor + ", \nprice=" + price );
		
	}
	

}
