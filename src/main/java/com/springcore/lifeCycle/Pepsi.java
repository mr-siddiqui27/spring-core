package com.springcore.lifeCycle;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{

	private String price;
	
	
	
	public String getPrice() {
		
		return price;
	}



	public void setPrice(String price) {
		System.out.println("setting pepsi price");
		this.price = price;
	}

	


	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// act like init
		System.out.println("Inside pepsi : init");
		
	}



	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Pesi : destroy");
	}
	
	 

}
