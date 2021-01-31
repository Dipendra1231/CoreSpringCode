package com.Durgesh.SpringBeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
	ApplicationContext con = new ClassPathXmlApplicationContext("com/Durgesh/SpringBeanScope/SpringBeanScopeConfig.xml");
	Student student1 = con.getBean("ob",Student.class);
	//Student student1 = con.getBean("student",Student.class);
	//System.out.println(student1);
	
	//System.out.println(student1.getFriends());
	//System.out.println(student1.getFriends().getClass().getName());
	
	System.out.println("------------for HashCode of Student class without xml---------------");
	Student student2 = con.getBean("ob",Student.class);
	System.out.println(student1.hashCode());    //default hashCode is singleton so many objects give same value
	System.out.println(student2.hashCode());    //default hashCode is singleton so many objects give same value
	
	
	System.out.println("------------for HashCode of Teacher class with xml---------------");
	Teacher t1 = con.getBean("temp",Teacher.class);
	Teacher t2 = con.getBean("temp",Teacher.class);
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	
	}

}
