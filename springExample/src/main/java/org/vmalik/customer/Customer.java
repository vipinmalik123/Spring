package org.vmalik.customer;

import java.util.Date;

public class Customer {
	private String name;
	private Address address;
	private int age;
	private Date dob;

	public Customer(String name, Address address, int age, Date dob) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.dob = dob;
	}

	//getter and setter methods
	public String toString(){
		return " name : " +name + "\n address : "
               + address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity() 
               + ", " + address.getState() + ", " + address.getCountry() + " - " + address.getZip() 
				+ "\n age : " + age
				+ "\n Dob : " + dob.toString();
	}
}
