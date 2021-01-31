package com.AndroidTech4u;

import java.util.Iterator;
import java.util.List;

public class QuestionList {

	private int id;
	private String qname;
	private List<Answer>answer;
	
	/*public Question()
	{
		System.out.println("Default Constructor...........");
	}*/
	
	public QuestionList(int id,String qname,List<Answer>answer)
	{
		this.id=id;
		this.qname=qname;
		this.answer=answer;
	}
	
	public void show()
	{
		System.out.println(id+" "+qname);
		
		Iterator<Answer> iterator = answer.iterator();
		while(iterator.hasNext())
		{
			Answer aa = (Answer)iterator.next();
			System.out.println(aa.disp());
		}
	}
	
   
	/*public String toString()
	{
		return id+" "+qname+" "+answer;
	}*/
	
}
