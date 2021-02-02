package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

public class Driver {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();p.setProperty("pirate", "scu");
		
		try {
			
			badmethod();
			System.out.println("A");
		}catch (Exception e) {
			
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");
		
		
		Float f1 = new Float("3.0");
		int x = f1.intValue();
		byte b = f1.byteValue();
		double d = f1.doubleValue();
		System.out.println(x+b+d);
		final int i =2;
		//System.out.println(i++== 2);
		Integer i1 = 120;
		Integer j = 120;
		
		System.out.println(i1==j);
		
		i1 = 300;
		j = 300;
		System.out.println(i1==j);
	
	String[] cities = {"bang","delhi","bihar","patna"};
	mysort m = new mysort();

	Arrays.sort(cities,m);
	
	System.out.println(Arrays.binarySearch(cities,"bang"));
	
	}
	
	public static void badmethod() {
		throw new RuntimeException();
	}

}

class mysort implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}


