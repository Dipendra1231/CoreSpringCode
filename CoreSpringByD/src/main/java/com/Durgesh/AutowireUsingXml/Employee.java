package com.Durgesh.AutowireUsingXml;
//Using byName,byType,constructor for Autowiring with help of Xml 
public class Employee {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter method");
		this.address = address;
	}

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
