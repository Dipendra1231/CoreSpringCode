package com.Durgesh.AutowireUsingAnnotations;

public class Address {
	
	private String Name;
	private String Street;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}

	public Address(String name, String street) {
		super();
		Name = name;
		Street = street;
	}
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [Name=" + Name + ", Street=" + Street + "]";
	}
	
	
}
