package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {
	public static void main(String[] args) {
		
//		Injecting reference type
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/refconfig.xml");
		A obj = (A) context.getBean("aref");
		System.out.println(obj);
		System.out.println(obj.getObj().getY());

		
		
		
	}
	

}
