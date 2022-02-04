package com.package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_comparator {
	public static void main(String[] args) {
		List<Mobiles02> mb = new ArrayList<>();
		System.out.println(mb);
		mb.add(new Mobiles02("sumsung",35000,6,64));
		mb.add(new Mobiles02("redmi",16000,6,64));
		mb.add(new Mobiles02("realme",22000,8,108));
		mb.add(new Mobiles02("iPhone",78000,4,16));
		mb.add(new Mobiles02("asus",34500,8,64));
		System.out.println(mb);
		for(Mobiles02 l:mb) {
			System.out.println(l);
		}
			Comparator<Mobiles02> comp = new Comparator<Mobiles02>() {

				@Override
				public int compare(Mobiles02 o1, Mobiles02 o2) {
					if(o1.getRam()>o2.getRam())
						return 420;
					else
						return -420;
				}
				
			};
		Collections.sort(mb,comp);
		System.out.println("after sorting");
		for(Mobiles02 l:mb) {
			System.out.println(l);
		}
	}
}
