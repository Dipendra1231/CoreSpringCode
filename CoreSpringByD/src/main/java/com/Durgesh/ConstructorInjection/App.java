package com.Durgesh.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Durgesh/ConstructorInjection/ConstructorInjectionConfig.xml");
	    Persion p = (Persion) context.getBean("per");	
	    System.out.println(p);
	    p.disp();
	    
	    Addition a = (Addition) context.getBean("add");
	    System.out.println(a);
	    a.doSum();
	}

}
