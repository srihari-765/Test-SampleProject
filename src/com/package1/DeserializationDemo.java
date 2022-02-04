package com.package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("abc");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		DataSet set = (DataSet) ois.readObject();
		System.out.println(set);
	}

}
