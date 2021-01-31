package com.Durgesh.SpringExpressionLanguage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String args[]) 
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("com/Durgesh/SpringExpressionLanguage/SpELConfig.xml");
		Demo d = con.getBean("demo",Demo.class);
		System.out.println(d);
		
	}
	
}
