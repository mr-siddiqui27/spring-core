package com.springcore.lifeCycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifeCycle/lifeCycleConfig.xml");
		Samosa s = (Samosa) context.getBean("samosa1");
		System.out.println(s);
		
		// registering shutdown hook
		context.registerShutdownHook();
		
 
		Pepsi p = (Pepsi) context.getBean("pepsi1");
		System.out.println(p);

	}

}
