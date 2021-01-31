package com.AndroidTech4u;

public class Employee {
	String name[];
	Address adr;
	
	public Employee(String name[])
	{
		this.name=name;
	}
	public Employee(Address adr)
	{
		this.adr=adr;
		//System.out.println("Default Constructor...........");
	}
	
	public Employee()
	{
		System.out.println("Default Constructor...........");
	}
	
	public Employee(int age)
	{
		System.out.println("Employee age is: "+age);
	}
	
	public Employee(String name)
	{
		System.out.println("Employee name is:"+name);
	}
	
	public Employee(int age ,String name)
	{
		System.out.println("Employee name and age is: "+name+","+age);
	}
	

	public void show()
	{
		System.out.println(adr);
	}
	
	public void disp()
	{
		System.out.println(name[0]+" "+name[1]+" "+name[2]);
	}
}
