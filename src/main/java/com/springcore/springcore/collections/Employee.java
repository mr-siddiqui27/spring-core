package com.springcore.springcore.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Employee {
	private String name;
	private List<String> contactNo;
	private Set<String> address;
	private Map<String, String> course;
	
	
	
	
	public Employee(String name, List<String> contactNo, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.course = course;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getContactNo() {
		return contactNo;
	}
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", contactNo=" + contactNo + ", address=" + address + ", course=" + course
				+ "]";
	}

	 
	
	
	 
	
	

}
