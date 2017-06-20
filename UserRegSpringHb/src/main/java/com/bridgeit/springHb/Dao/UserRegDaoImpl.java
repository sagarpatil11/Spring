package com.bridgeit.springHb.Dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.springHb.model.Employee;
import com.bridgeit.springHb.model.UserReg;

@Repository
//@Transactional
public class UserRegDaoImpl implements UserRegDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public ModelAndView addUser(UserReg user) 
	{
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//Transaction t=session.beginTransaction();
		try
		{
			session.save(user);
	
		}
		catch(Exception e)
		{
			System.out.println("Error");
			return new ModelAndView("redirect:SignUp");
		}
		return null;
		
	
	}

	@Override
	public List<UserReg> getUser(String email,String password) 
	{
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		try
		{
			String q="FROM UserReg where email =:email and password =:password";
			Query query=session.createQuery(q);
			query.setParameter("email", email);
			query.setParameter("password", password);
			List<UserReg> list=query.list();
			
			System.out.println(list.size());
			System.out.println(list.toString());
			
			return list;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			//return new ModelAndView("login");
		}
		/*finally 
		{
			if(session!=null)
			{
				session.close();
			}
		}*/
		return null;
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		if(session!=null)
		{
			session.invalidate();
		}
	}

}
