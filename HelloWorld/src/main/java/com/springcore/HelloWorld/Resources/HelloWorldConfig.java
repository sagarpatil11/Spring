package com.springcore.HelloWorld.Resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcore.HelloWorld.Domain.HelloWorldImpl;
import com.springcore.HelloWorld.Domain.Helloworld;

@Configuration
public class HelloWorldConfig 
{
	@Bean(name="helloworldbean")
	public Helloworld helloWorld(){
		return new HelloWorldImpl();
	}
}
