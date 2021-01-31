package com.AndroidTech4u;

public class Address {

	String city,state,country;
	int age;
	Address(String city,String state,String country,int age)
	{
		this.age=age;
		this.city=city;
		this.state=state;
		this.country=country;
		System.out.println("City:"+city+", State:"+state+", Country:"+country+",Age:"+age);
	}
	
	public String toString()
	{
		return city+" "+state+" "+country+" "+age;
	}
}
