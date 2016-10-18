package org.vmalik.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vmalik.common.FileNameGenerator;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.vmalik.config.AppConfig;
import org.vmalik.customer.Customer;

public class App {
	public static void main(String[] args) {
		/*
		 * Spring bean definition with XML
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		
		
		/*
		 * Spring bean definition with Java annotation config class
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		*/
		
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		
		Customer cust = (Customer) context.getBean("Customer");
		System.out.println(cust);
		
		FileNameGenerator fng = (FileNameGenerator) context.getBean("fileNameGenerator");
		System.out.println(fng.generateName());
	}
}