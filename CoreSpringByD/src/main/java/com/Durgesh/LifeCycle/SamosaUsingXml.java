package com.Durgesh.LifeCycle;

public class SamosaUsingXml {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("setting price");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	
	 public SamosaUsingXml() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void hey()//init()
	 {
		 System.out.println("Inside init Method : hey how are you");
	 }
	 public void bye()//destroy()

	 {
		 System.out.println("Inside destroy Method : bye bye i am going to die");
	 }
	
}
