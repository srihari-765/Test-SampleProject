package com.package1;

import java.io.Serializable;

public class DataSet implements Serializable{
	private static  int  id;
	private String name;
	private double salary;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		DataSet.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "DataSet [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
