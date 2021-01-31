package com.AndroidTech4u;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuestionMap {
	
	private int id;
	private String qname;
	Map<String,String>answer;
	
	public QuestionMap(int id,String qname,Map<String,String>answer)
	{
		this.id=id;
		this.qname=qname;
		this.answer=answer;
	}
	
	public void show()
	{
		System.out.println(id+" "+qname);
		Set set = answer.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry entry=(Map.Entry)iterator.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	

}
