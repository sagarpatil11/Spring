package com.bridgeit.springHb.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.springHb.model.Employee;
import com.bridgeit.springHb.model.UserReg;

public interface UserRegService 
{
	public void addUser(UserReg user);
	public List<UserReg> getUser(String email,String password);
	public void logout(HttpSession session);
}
