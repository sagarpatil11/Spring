package com.bridgeit.springHb.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.springHb.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public ModelAndView addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//Transaction t=session.beginTransaction();
		try
		{
			session.save(employee);
			//	t.commit();
			//return new ModelAndView("registration");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ModelAndView("Employee_Reg");
		}
		return null;
	}

	@Override
	public List<Employee> getEmployee(int uid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		try
		{
			String q="FROM Employee where uid="+uid;
			Query query=session.createQuery(q);
			List<Employee> list=query.list();
			
			System.out.println(list.size());
			//System.out.println(list.toString());
			
			return list;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			//return new ModelAndView("login");
		}
		return null;
	}

	@Override
	public void deleteEmployee(int eid) 
	{
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		try
		{
			String q="delete from Employee where eid="+eid;
			Query query=session.createQuery(q);
			query.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.update(employee);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> employeeListByEid(int eid) 
	{
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		try
		{
			String q="FROM Employee where eid="+eid;
			Query query=session.createQuery(q);
			List<Employee> list=query.list();
			
			System.out.println(list.size());
			return list;
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
