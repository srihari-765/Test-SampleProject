package com.package1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		DataSet set = new DataSet();
		set.setId(1000);
		set.setName("jaideep");
		set.setSalary(40000);
		
		File file = new File("abc");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(set);
		System.out.println(set);
		
	}
	
}
