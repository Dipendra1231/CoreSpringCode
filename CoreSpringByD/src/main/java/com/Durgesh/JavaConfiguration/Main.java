package com.Durgesh.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//Student stu = context.getBean("mystudent",Student.class);  //student default onject can be used
		
		Student stu = context.getBean("getstudent",Student.class);
		
		//Student stu = context.getBean("temp",Student.class); 
		//Student stu = context.getBean("munu",Student.class); 
		//Student stu = context.getBean("p1",Student.class); 
		
		System.out.println(stu);
		stu.study();
	}

}
