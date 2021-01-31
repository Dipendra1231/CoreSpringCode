package com.AndroidTech4u;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import jdk.internal.loader.Resource;

public class Test
{


	public static void main(String args[])
       { 
		 try {
			     ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextConfig.xml");
			     System.out.println("XMl Is loaded.........");
			     ServiceProvider s=(ServiceProvider)ctx.getBean("spp");
			     System.out.println("Object Reference id: "+s);
			     String msg= s.getRemoteService();
			     System.out.println(msg);
			  
			  /*  ClassPathResource resource = new ClassPathResource("ApplicationContextConfig.xml");
			    BeanFactory beanfactory = new XmlBeanFactory(resource);
			    
			    ServiceProvider serviceprovider = (ServiceProvider)beanfactory.getBean("spp");
			    System.out.println("obj1:"+serviceprovider);
			    
			    ServiceProvider serviceprovider1 = (ServiceProvider)beanfactory.getBean("spp");
			    System.out.println("obj2:"+serviceprovider1);
			    
			    String msg= serviceprovider.getRemoteService();
			    System.out.println(msg);*/
			
		}
		 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	     /* ServiceProvider sp = new ServiceProvider();
	      String s=sp.getRemote();
	      System.out.println(s);
		*/
	
       }

	
}
