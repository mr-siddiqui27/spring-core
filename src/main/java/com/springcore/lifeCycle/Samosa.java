package com.springcore.lifeCycle;

public class Samosa {

	private int price;
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting samosa price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("inside Samosa : init method");
	}
	
	public void destroy() {
		System.out.println("Inside Samosa : destroy method");
	}
	
	
	
}
