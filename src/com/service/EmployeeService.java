package com.service;

import com.domain.Employee;

public interface EmployeeService {

	public void createEmployee(Employee employee);
	
	public  void updateEmployee(Employee employee);
	
	public void deleteEmployee(int employeeId);
	
	public Employee findByID(int employeeId);
	
	
}
