package com.bridgeit.springHb.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.springHb.Dao.UserRegDao;
import com.bridgeit.springHb.model.Employee;
import com.bridgeit.springHb.model.UserReg;

@Service
@Transactional
public class UserRegServiceImpl implements UserRegService
{
	@Autowired
	UserRegDao userRegDao;
	
	@Override
	//@Transactional
	public void addUser(UserReg user) 
	{
		// TODO Auto-generated method stub
		userRegDao.addUser(user);
	
	}

	@Override
	public List<UserReg> getUser(String email,String password) {
		// TODO Auto-generated method stub
		return userRegDao.getUser(email,password);
	}

	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		userRegDao.logout(session);
	}

}
