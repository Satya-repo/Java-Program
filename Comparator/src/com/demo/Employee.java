package com.demo;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	private String name;
	private int id;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		o1.getName().compareTo(o2.getName());
		if((o1.getName().compareTo(o2.getName())==0)){
			return (int) (o1.getId()-o2.getId());
			
		}
		else 
			return o1.getName().compareTo(o2.getName());
		
	}

}
