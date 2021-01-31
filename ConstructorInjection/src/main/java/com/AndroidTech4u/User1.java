package com.AndroidTech4u;

public class User1 {
 
	private int id;
	private String PostedDate;
	private String answer;
	
	public User1(int id,String PostedDate,String answer)
	{
		this.id=id;
		this.PostedDate=PostedDate;
		this.answer=answer;
	}
	
	public String toString()
	{
		return id+" "+PostedDate+" "+answer;
	}
	
}
