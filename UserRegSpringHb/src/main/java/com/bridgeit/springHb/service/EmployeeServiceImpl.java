package com.bridgeit.springHb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.springHb.Dao.EmployeeDao;
import com.bridgeit.springHb.model.Employee;

@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(employee);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Employee> getEmployee(int uid) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(uid);
		
	}

	@Transactional
	public void deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(eid);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		employeeDao.updateEmployee(employee);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Employee> employeeListByEid(int eid) 
	{
		// TODO Auto-generated method stub
		return employeeDao.employeeListByEid(eid);
	}
	
}
