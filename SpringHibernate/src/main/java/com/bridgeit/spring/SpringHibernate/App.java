package com.bridgeit.spring.SpringHibernate;

import java.util.List;

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
      ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
       
      
       PersonDao personDao=context.getBean(PersonDao.class);
       
       Person person=new Person();
       person.setName("sagar");
       person.setAddress("dhule");
       
       personDao.savePerson(person);
       
       List<Person> plist=personDao.listPerson();
       
       for(Person p:plist)
       {
    	   System.out.println("Person List "+p);
       }
    }
}
