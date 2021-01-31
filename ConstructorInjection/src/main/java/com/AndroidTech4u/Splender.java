package com.AndroidTech4u;

public class Splender {
	
	private String model;
	private float price;
	
	public Splender(String model,float price)
	{
		this.model=model;
		this.price=price;
	}
	
	public String toString()
	{
		return model+" "+price;
	}

}
