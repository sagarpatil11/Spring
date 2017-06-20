package com.bridgeit.springHb.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bridgeit.springHb.model.UserReg;
import com.bridgeit.springHb.service.UserRegService;

@Controller
public class UserRegController 
{
	@Autowired
	UserRegService userRegService;
//	SessionFactory sessionFactory;
	
	@RequestMapping(value={"/","/login"})
	public ModelAndView indexPage(HttpServletRequest request,HttpServletResponse response)
	{
		Integer uid=(Integer) request.getSession().getAttribute("uid");
		if(uid!=null)
		{
			System.out.println("login");
			return new ModelAndView("redirect:Employee_Reg");
	
		}
		else
		{
			System.out.println("loginpage");
			return new ModelAndView("login");
		}
	}	
	/*
	@RequestMapping(value="/login")
	public ModelAndView loginPage()
	{
		return new ModelAndView("login");
	}*/
	
	@RequestMapping(value="/SignUp")
	public ModelAndView registerPage()
	{
		return new ModelAndView("registration","user",new UserReg());
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView userRegister(@Valid @ModelAttribute("user")UserReg user,BindingResult results)
	{
		if(results.hasErrors())
		{
			return new ModelAndView("registration","user",user);
		}
		else
		{
			userRegService.addUser(user);
			return new ModelAndView("redirect:login");
		}	
		
	}
	
	@RequestMapping(value="/loginvalidation",method=RequestMethod.POST)
	public ModelAndView userLogin(String email, String password,HttpServletRequest request,HttpServletResponse response,
									final RedirectAttributes redirectAttributes	)
	{
	
	//	System.out.println(email+" "+password);
		
		List<UserReg> list=userRegService.getUser(email,password);
		
		if(list.size() > 0)
		{
			Iterator<UserReg> iterator=list.iterator();
			while(iterator.hasNext())
			{
				UserReg user=(UserReg) iterator.next();
				int uid=user.getId();
				System.out.println(uid+" uid");
				request.getSession().setAttribute("uid",uid);
			}
			
			return new ModelAndView("redirect:Employee_Reg");
		}
		else
		{
			String errmsg="Wrong email or password";
			redirectAttributes.addFlashAttribute("errmsg", errmsg);
			return new ModelAndView("redirect:login");
		}
	}
	
	@RequestMapping(value="/Logout")
	public ModelAndView logout(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		userRegService.logout(session);
		return new ModelAndView("redirect:login");
		
	}
	
}
