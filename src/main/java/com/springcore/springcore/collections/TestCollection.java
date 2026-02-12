package com.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class TestCollection {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/collections/collectionConfig.xml");
		
		Employee emp1 = (Employee) context.getBean("employee1");
		System.out.println(emp1);
	}

}
