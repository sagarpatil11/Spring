package com.bridgeit.RestDemo.model;

public class Message 
{
	String name;
	String msg;
	
	public Message(String name,String msg)
	{
		this.name=name;
		this.msg=msg;
	}
	
	 public String getName() 
	 {
	        return name;
	 }
	 
	 public String getText() 
	 {
	        return msg;
	 }
}

