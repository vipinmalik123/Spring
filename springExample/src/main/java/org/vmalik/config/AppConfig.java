package org.vmalik.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.vmalik.core.HelloWorld;
import org.vmalik.customer.Address;
import org.vmalik.customer.Customer;

@Configuration
/*
 * To modularize bean definitions, use @import annotation
 * @import({Config1.class,Config2.class})
*/
public class AppConfig {

	@Bean(name="helloBean")
	public HelloWorld helloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("Vipin Malik");
        return helloWorld;
    }
	
	@SuppressWarnings("deprecation")
	@Bean(name="CustomerBean")
	public Customer customer() {
		return new Customer("Vipin Malik", new Address(), 28, new Date("01/01/1986"));
	}
}
