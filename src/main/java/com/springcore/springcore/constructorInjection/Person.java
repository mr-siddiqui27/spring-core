package com.springcore.springcore.constructorInjection;

public class Person {
	private String name;
	private int age;
	Address add;
	public Person(String name, int age, Address add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}
	@Override
	public String toString() {
		return "name :"+this.name+" age: "+this.age+" Address: "+this.add;
	}
	
	
	
}
