package com.package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Array {
	public static void main(String[] args) {
		List<Mobiles> mb = new ArrayList<>();
		System.out.println(mb);
		mb.add(new Mobiles("sumsung",35000,6,64));
		mb.add(new Mobiles("redmi",16000,6,64));
		mb.add(new Mobiles("realme",22000,8,108));
		mb.add(new Mobiles("iPhone",78000,4,16));
		mb.add(new Mobiles("asus",34500,8,64));
		System.out.println(mb);
		for(Mobiles l:mb) {
			System.out.println(l);
			
		}
		System.out.println("After sorting ");
		Collections.sort(mb);
		for(Mobiles l:mb) {
			System.out.println(l);
		}
	}
}
