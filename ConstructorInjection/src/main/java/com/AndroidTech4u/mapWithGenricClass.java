package com.AndroidTech4u;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapWithGenricClass {
	
	private int id;
	private String qname;
	Map<User1,User2>answer;
	
	public mapWithGenricClass(int id,String qname,Map<User1,User2>answer)
	{
	   this.id=id;
	   this.qname=qname;
	   this.answer=answer;
	}
	
	public void disp()
	{
		System.out.println("Id: "+id);
		System.out.println("Question Name: "+qname);
		System.out.println("Answer: ");
		Set set = answer.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry entry = (Entry) iterator.next();
			User1 user1 = (User1) entry.getKey();
			User2 user2 = (User2) entry.getValue();	
		    System.out.println(user1);
		    System.out.println(user2);
		}
	}
	
	
	
	 

}
