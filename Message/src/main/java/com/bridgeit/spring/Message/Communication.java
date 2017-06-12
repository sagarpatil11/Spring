package com.bridgeit.spring.Message;

public class Communication 
{
	private Messaging message;


	public void setMessage(Messaging message) {
		this.message = message;
	}
	
	public void communicate()
	{
		message.sendmessage();
	}
}
