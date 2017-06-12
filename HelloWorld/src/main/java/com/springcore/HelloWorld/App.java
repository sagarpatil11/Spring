package com.springcore.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.springcore.HelloWorld.Domain.Helloworld;
import com.springcore.HelloWorld.Resources.HelloWorldConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    	Helloworld bean=(Helloworld) context.getBean("helloworldbean");
    	bean.sayHello("World");
    	context.close();
    }
}
