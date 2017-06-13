package com.bridgeit.springHb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.springHb.model.UserReg;
import com.bridgeit.springHb.service.UserRegService;

@Controller
public class UserRegController 
{
	@Autowired
	UserRegService userRegService;
//	SessionFactory sessionFactory;
	
	@RequestMapping(value={"/","/login"})
	public ModelAndView indexPage()
	{
		return new ModelAndView("login");
	}
	/*
	@RequestMapping(value="/login")
	public ModelAndView loginPage()
	{
		return new ModelAndView("login");
	}*/
	
	@RequestMapping(value="/userregistration")
	public ModelAndView registerPage()
	{
		return new ModelAndView("registration");
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView userRegister(UserReg user)
	{
		
		userRegService.addUser(user);
		return new ModelAndView("redirect:login");
		
		
	}
	
	@RequestMapping(value="/loginvalidation",method=RequestMethod.POST)
	public ModelAndView userLogin(String email, String password,HttpServletRequest request,HttpServletResponse response)
	{
	
	//	System.out.println(email+" "+password);
		
		List<UserReg> list=userRegService.getUser(email,password);
		
		if(list.size() > 0)
		{
			
			
			return new ModelAndView("redirect:Home");
		}
		else
		{
		
			return new ModelAndView("redirect:login");
		}
		
		
	}
	@RequestMapping("/Home")
	public ModelAndView home()
	{
	
	
		return new ModelAndView("home");
		
	}
	
	
}
