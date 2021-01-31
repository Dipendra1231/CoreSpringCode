package com.AndroidTech4u.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main1 {
	
	public static void main(String args[])
	{
	    ApplicationContext cont = new ClassPathXmlApplicationContext("com/AndroidTech4u/in/ApplicationContext.xml");
	    Employee1 e=cont.getBean("emp",Employee1.class);
	    System.out.println(e);
	    e.show();
	}


	
	
}
