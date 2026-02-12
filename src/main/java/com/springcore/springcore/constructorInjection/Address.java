package com.springcore.springcore.constructorInjection;

public class Address {
	String address;

	public Address(String add) {
		this.address = add;
	}

	@Override
	public String toString() {
		return this.address;
	}
	

}
