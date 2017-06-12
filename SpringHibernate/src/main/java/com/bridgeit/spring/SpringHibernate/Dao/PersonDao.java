package com.bridgeit.spring.SpringHibernate.Dao;

import java.util.List;

import com.bridgeit.spring.SpringHibernate.Model.Person;

public interface PersonDao 
{
	public void savePerson(Person person);
	public List<Person> listPerson();
}
