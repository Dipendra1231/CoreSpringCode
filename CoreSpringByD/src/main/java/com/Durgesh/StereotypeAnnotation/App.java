package com.Durgesh.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
	ApplicationContext con = new ClassPathXmlApplicationContext("com/Durgesh/StereotypeAnnotation/StereotypeConfig.xml");
	Student stu = con.getBean("ob",Student.class);
	//Student stu = con.getBean("student",Student.class);
	System.out.println(stu);
	
	System.out.println(stu.getFriends());
	System.out.println(stu.getFriends().getClass().getName());
	}

}
