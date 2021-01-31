package com.Durgesh.ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
   public static void main(String args[])
  {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/Durgesh/ReferenceInjection/ReferenceInjectionConfig.xml");
	A a=(A)context.getBean("aref");
	
	System.out.println(a);
	
	System.out.println(a.getX());
	System.out.println(a.getOb().getY());
	System.out.println(a.getOb().getZ());
	
	
 }
}
	
