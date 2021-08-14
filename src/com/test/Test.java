package com.test;

import com.domain.Employee;
import com.serviceimpl.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmployeeId(10);
		employee.setFirstName("siva");
		employee.setMiddleName("k");
		employee.setLastName("naga");
		 
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		//employeeServiceImpl.createEmployee(employee);
		
		//employeeServiceImpl.deleteEmployee(10);
		
		
	//	employeeServiceImpl.findByID(11);

		int id = employee.getEmployeeId();
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String middleName = employee.getMiddleName();
		
		System.out.println(id+" "+firstName+" "+lastName+" "+middleName);
		
		
		Employee employee1 = new Employee();
		employee1.setEmployeeId(10);
		employee1.setFirstName("suri");
		employee1.setMiddleName("v");
		employee1.setLastName("kosireddi");
		employeeServiceImpl.updateEmployee(employee1);
		
		
	}

}
