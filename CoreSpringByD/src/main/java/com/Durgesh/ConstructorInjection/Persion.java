package com.Durgesh.ConstructorInjection;

import java.util.List;

public class Persion {
	
	private String name;
	private int persionId;
	private Certificate certificate;
	private List<String>list;
	
	public Persion(String name, int persionId,Certificate certificate,List<String>list) {
		super();
		this.name = name;
		this.persionId = persionId;
		this.certificate=certificate;
		this.list=list;
		System.out.println(name+" "+persionId+" "+certificate+" "+list);
	}

 
	
	@Override
	public String toString() {
		//return name+":"+persionId+":"+certificate;
		return "Persion [name=" + name + ", persionId=" + persionId + ", certificate=" + certificate + ", List="+ list +"]";
	}



	void disp()
	{
		System.out.println(name+":"+persionId+" "+certificate+" "+list);
	}
	
}
