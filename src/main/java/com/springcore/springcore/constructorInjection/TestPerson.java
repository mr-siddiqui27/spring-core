package com.springcore.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/constructorInjection/ciconfig.xml");
		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);
		System.out.println(p1.add.address);
		
		
		Addition addition = (Addition) context.getBean("addition1");
		System.out.println(addition);
		
	}

}
