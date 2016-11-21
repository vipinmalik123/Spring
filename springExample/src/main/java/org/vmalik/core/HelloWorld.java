package org.vmalik.core;

/**
 * Spring bean
 *
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void printHello() {
		System.out.println("Spring : Hello ! " + name);
	}
}