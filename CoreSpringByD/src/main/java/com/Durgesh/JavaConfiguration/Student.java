package com.Durgesh.JavaConfiguration;

import org.springframework.stereotype.Component;

//@Component("mystudent")
public class Student {
	
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}



	public Samosa getSamosa() {
		return samosa;
	}



	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}



	public void study()
	{
		samosa.display();  //this.samosa.display();
		System.out.println("Students are reading book.........");
	}

}
