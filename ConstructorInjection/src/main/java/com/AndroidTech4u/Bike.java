package com.AndroidTech4u;

public class Bike {
    
	private int number;
	private String name;
	private Splender splender;
	 
	public Bike()
	{
		
	}
	 
	public Bike(int number,String name)
	{
		this.number=number;
		this.name=name;
	}
	
	public Bike(int number,String name,Splender splender)
	{
		this.number=number;
		this.name=name;
		this.splender=splender;
	}
	
	public void disp()
	{
		System.out.println("Bike Number:"+number);
		System.out.println("Bike Name:"+name);
		System.out.println("Bike Model And Price:"+splender);
	}
}
