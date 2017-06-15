package com.bridgeit.springHb.service;

import java.util.List;

import com.bridgeit.springHb.model.Employee;

public interface EmployeeService 
{
	public void addEmployee(Employee employee);
	public List<Employee> getEmployee(int uid);
	public void deleteEmployee(int eid);
	public void updateEmployee(Employee employee);
	public List<Employee> employeeListByEid(int eid);
}
