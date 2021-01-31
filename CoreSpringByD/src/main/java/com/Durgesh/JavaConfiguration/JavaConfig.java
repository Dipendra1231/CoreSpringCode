package com.Durgesh.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.Durgesh.JavaConfiguration") //this is scan for java class but not use @Component it shouldnot need
public class JavaConfig {
	
	@Bean
	public Samosa getsamosa()
	{
		Samosa samosa = new Samosa();
		return samosa;  //return new Samosa();
	}
	
	@Bean       //@Bean(name={"temp","munu","p1"})
	public Student getstudent()
	{
		Student student = new Student(getsamosa());  //create new  Student object and return same type of object like Student
		return student;
	}

}
