package com.bridgeit.spring.SpringHibernate.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bridgeit.spring.SpringHibernate.Model.Person;

public class PersonDaoImpl implements PersonDao 
{
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.persist(person);
		t.commit();
		session.close();
		
	}

	public List<Person> listPerson() {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.openSession();
		List<Person> personlist=session.createQuery("from Person").list();
		session.close();
		return personlist;
	}

}
