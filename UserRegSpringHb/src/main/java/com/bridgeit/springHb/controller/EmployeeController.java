package com.bridgeit.springHb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.springHb.model.Employee;
import com.bridgeit.springHb.service.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/Employee_Reg")
	public ModelAndView home()
	{
	
	
		return new ModelAndView("EmployeeReg");
		
	}
	
	
	@RequestMapping(value="/Employee_Registration",method=RequestMethod.POST)
	public ModelAndView addEmployee(HttpServletRequest request,Employee employee)
	{
		System.out.println("hiiiiii");
		Integer uid=Integer.parseInt(request.getSession().getAttribute("uid").toString());
		System.out.println(uid);
		employee.setUid(uid);
		employeeService.addEmployee(employee);
		return new ModelAndView("redirect:Employee_Reg");
	}
	
	@RequestMapping(value="/Employee_List")
	public ModelAndView employeeList(HttpServletRequest request)
	{
		//Integer uid=Integer.parseInt(request.getSession().getAttribute("uid").toString());
		Integer uid=(Integer)request.getSession().getAttribute("uid");
		List<Employee> emplist=employeeService.getEmployee(uid);
		
		return new ModelAndView("employee_list","emplist",emplist);
	}
	
	@RequestMapping(value="/delete")
	public ModelAndView employeeDelete(@RequestParam("id") int eid)
	{
		System.out.println("delete "+eid);
		employeeService.deleteEmployee(eid);
		return new ModelAndView("redirect:Employee_List");
		
	}
	
	@RequestMapping(value="/update")
	public ModelAndView employeeUpdate(@RequestParam("id") int eid)
	{
		//System.out.println(" "+eid);
		List<Employee> list=employeeService.employeeListByEid(eid);
		return new ModelAndView("updateEmployee","list",list);
		
	}
	
	@RequestMapping(value="/Update_Employee",method=RequestMethod.POST)
	public ModelAndView updateEmp(HttpServletRequest request,Employee employee)
	{
		Integer uid=Integer.parseInt(request.getSession().getAttribute("uid").toString());
		System.out.println(uid);
		employee.setUid(uid);
		employeeService.updateEmployee(employee);
		return new ModelAndView("redirect:Employee_List");
	}
	
	
	
}
