package com.package1;

public class UserDetails {
	int age;
	String name;
	String city;
	int pincode;
	@Override
	public String toString() {
		return "UserDetails [age=" + age + ", name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public UserDetails(int age, String name, String city, int pincode) {
		
		this.age = age;
		this.name = name;
		this.city = city;
		this.pincode = pincode;
	}
	public UserDetails(){}
	public UserDetails(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	
}
