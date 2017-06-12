package com.bridgeit.spring.Message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");
       Communication communication=(Communication) context.getBean("communication");
       communication.communicate();
    }
}
