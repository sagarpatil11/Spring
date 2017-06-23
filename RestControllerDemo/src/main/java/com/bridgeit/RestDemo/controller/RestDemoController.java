package com.bridgeit.RestDemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.RestDemo.model.Message;

@RestController
public class RestDemoController 
{
	@RequestMapping("/")
	public String welcome()
	{
		return "Welcome,It is Rest Controller Demo";
	}
	
	@RequestMapping("/hello/{name}")
	public Message message(@PathVariable String name)
	{
		Message msg=new Message(name, "Hello " +name);
		return msg;
		
	}
}
