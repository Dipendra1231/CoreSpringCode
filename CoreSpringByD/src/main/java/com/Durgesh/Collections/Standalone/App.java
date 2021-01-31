package com.Durgesh.Collections.Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Durgesh/Collections/Standalone/StandaloneConfig.xml");
		Persion p = context.getBean("persion",Persion.class);
		System.out.println(p);
		
		System.out.println("-------------------------------------------");
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p.getFriends());
		
		System.out.println("-------------------------------------------");
		System.out.println(p.getFeestructure().getClass().getName());
		System.out.println(p.getFeestructure());
		
		System.out.println("-------------------------------------------");
		System.out.println(p.getProperties().getClass().getName());
		System.out.println(p.getProperties());
		
		
		
	}

}
