package com.Durgesh.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Durgesh/LifeCycle/LIfeCycleConfig.xml"); 
       SamosaUsingXml sam = (SamosaUsingXml) context.getBean("s1");
       System.out.println(sam);
       
       context.registerShutdownHook();
       
       System.out.println("----------for pepsi ------------");
       PepsiUsingInterface p=(PepsiUsingInterface) context.getBean("p1");
       System.out.println(p);
       
       System.out.println("----------for Example----------");
       ExampleUsingAnnotations exa=(ExampleUsingAnnotations) context.getBean("ex");
       System.out.println(exa);
       
       
	}

}
