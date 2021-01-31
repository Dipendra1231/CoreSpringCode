package com.Durgesh.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Durgesh/Collections/CollectionsConfig.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
		System.out.println(emp.getEmpDetails());
		
		System.out.println(emp.getPhones().getClass().getName());
		
	}

}
