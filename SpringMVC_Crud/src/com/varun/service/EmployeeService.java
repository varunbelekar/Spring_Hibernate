package com.varun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.varun.dao.EmployeeDAO;
import com.varun.model.Employee;

public class EmployeeService {
	@Autowired
	EmployeeDAO eDao;
	
	
	public void seteDao(EmployeeDAO eDao) {
		this.eDao = eDao;
	}


	public  void saveEmployeeService(Employee emp){		
		eDao.saveEmployee(emp);
	}
	
	public List<Employee> viewEmployeeService(){
		List<Employee> list= eDao.viewEmployee();
		return list;
	}
	
	public void deleteEmployeeService(String name){
		eDao.deleteEmployee(name);
	}
	
	public void updateEmployeeService(Employee e){
		eDao.updateEmployee(e);
	}
	
	public Employee getEmployeeService(String name){		
		Employee e=eDao.getEmployee(name);
		return e;
	}
}
