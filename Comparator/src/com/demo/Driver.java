package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		Employee employee = new Employee("satya", 26);
		Employee employee2 = new Employee("Abhishek", 25);
		Employee employee3 = new Employee("satya", 24);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		System.out.println(list);
		Collections.sort(list,new Employee());
		System.out.println(list);
		
		//Collections.sort

		
		
		

	}

}
