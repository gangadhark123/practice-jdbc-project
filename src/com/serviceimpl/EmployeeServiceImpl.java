package com.serviceimpl;

import com.dao.EmployeeDao;
import com.domain.Employee;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void createEmployee(Employee employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		int employeeId = employee.getEmployeeId();
		
		if((employeeId >0 && (firstName != null && !firstName.isEmpty()) &&(lastName != null && !lastName.isEmpty())) ) {
			EmployeeDao employeeDao = new EmployeeDao();
			employeeDao.insertEmployee(employee);
		}
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public Employee findByID(int employeeId) {
		Employee employee = new Employee();
		EmployeeDao employeeDao = new EmployeeDao();
		employee = employeeDao.findEmployeeById(employeeId);
		return employee;
	}

}
