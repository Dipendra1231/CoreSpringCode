package com.Durgesh.AutowireUsingAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])
	 {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/Durgesh/AutowireUsingAnnotations/AutowireConfig.xml"); 
		Employee a= con.getBean("emp",Employee.class);
		System.out.println(a);
	 }
	
	

}
