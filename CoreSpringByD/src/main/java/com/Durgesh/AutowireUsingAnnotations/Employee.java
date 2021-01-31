package com.Durgesh.AutowireUsingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// Autowiring with help of Autowired
public class Employee {
     
	@Autowired
	@Qualifier("address")//@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setter method");
		this.address = address;
	}

	//@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Constructor..........");
	
		this.address = address;
	}
     
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
