package com.Durgesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Durgesh/Config.xml");
		//Student stu = context.getBean("Student1");
		//System.out.println(stu);
		
		Student student1 = (Student) context.getBean("Student1");
		Student student2 = (Student) context.getBean("Student2");
		System.out.println(student1);
		System.out.println(student2);
		
	}

}
