package com.domain;

public class Employee {

	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Employee() { }

	public Employee(int employeeId, String firstName, String middleName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + "]";
	}
	
	
}
