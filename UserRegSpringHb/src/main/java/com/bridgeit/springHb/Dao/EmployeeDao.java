package com.bridgeit.springHb.Dao;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.springHb.model.Employee;

public interface EmployeeDao 
{
	public ModelAndView addEmployee(Employee employee);
	public List<Employee> getEmployee(int uid);
	public void deleteEmployee(int eid);
	public void updateEmployee(Employee employee);
	public List<Employee> employeeListByEid(int eid);
}
