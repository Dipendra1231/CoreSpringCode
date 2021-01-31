package com.AndroidTech4u;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {

	public static void main(String args[])
	{
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/AndroidTech4u/ApplicationContextConfig.xml");
		Bike bike=(Bike)cont.getBean("b2");
		bike.disp(); 
		
		//mapWithGenricClass q=(mapWithGenricClass)cont.getBean("mp");
		//q.disp();
		
		//QuestionMap question=(QuestionMap)cont.getBean("que");
		//question.show();
		//System.out.println(question);
		
		/*ApplicationContext cont = new ClassPathXmlApplicationContext("com/AndroidTech4u/ApplicationContextConfig.xml");
		 System.out.println("XMl Is loaded.........");
	     Employee adr=(Employee)cont.getBean("emp");
	     System.out.println("Object Reference id: "+adr);
		 adr.disp();   //for string 
	     //adr.show();*/
		 
		/*Resource resource = new ClassPathResource("com/AndroidTech4u/ApplicationContextConfig.xml");
		BeanFactory beanfactory = new XmlBeanFactory("resource");
		beanfactory.getBean("emp");
		beanfactory.getBean("add");
		*/
	}
}
