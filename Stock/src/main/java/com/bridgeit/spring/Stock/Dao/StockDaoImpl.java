package com.bridgeit.spring.Stock.Dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeit.spring.Stock.Model.Stock;

@Repository
public class StockDaoImpl implements StockDao
{
	@Autowired
	SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void save(Stock stock) 
	{
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(stock);
		t.commit();
		session.close();
	}

}
