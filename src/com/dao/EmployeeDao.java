package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.connection.DatabaseConncetion;
import com.domain.Employee;

public class EmployeeDao {

	public void insertEmployee(Employee employee) {
		Connection connection = DatabaseConncetion.dbConnction();
		String insertQuery = "INSERT INTO EMPLOYEESCHEMA1.EMPLOYEE VALUES(?,?,?,?)";

		try {
			PreparedStatement prepareStatement = connection.prepareStatement(insertQuery);

			prepareStatement.setInt(1, employee.getEmployeeId());
			prepareStatement.setString(2, employee.getFirstName());
			prepareStatement.setString(3, employee.getMiddleName());
			prepareStatement.setString(4, employee.getLastName());
			prepareStatement.executeUpdate();
			System.out.println("insertQuery ---->"+insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public Employee findEmployeeById(int employeeId) {
		Employee employee = new Employee();
		Connection connection = DatabaseConncetion.dbConnction();

		String selectQuery = "SELECT * FROM EMPLOYEESCHEMA1.EMPLOYEE WHERE EMPLOYEE_ID = ?";

		try {
			PreparedStatement prepareStatement = connection.prepareStatement(selectQuery);
			prepareStatement.setInt(1, employeeId);

			ResultSet rs = prepareStatement.executeQuery();
			while (rs.next()) {
				employee.setEmployeeId(rs.getInt("employee_id"));
				employee.setFirstName(rs.getString("first_name"));
				employee.setLastName(rs.getString("last_name"));
				employee.setMiddleName(rs.getString("middle_name"));

			}
			System.out.println(selectQuery);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employee;

	}

	public void updateEmployee(Employee employee) {
		Connection connection = DatabaseConncetion.dbConnction();

		String updateSqlQuery = "UPDATE EMPLOYEESCHEMA1.EMPLOYEE SET FIRST_NAME = ?,MIDDLE_NAME = ?,LAST_NAME=? WHERE EMPLOYEE_ID = ?";
		try {
			PreparedStatement preparestatement = connection.prepareStatement(updateSqlQuery);
			preparestatement.setString(1, employee.getFirstName());
			preparestatement.setString(2, employee.getMiddleName());
			preparestatement.setString(3, employee.getLastName());
			preparestatement.setInt(4,employee.getEmployeeId());
			
			preparestatement.executeUpdate();
			System.out.println("update query ----------->"+updateSqlQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public void deleteEmployee(int employeeId) {
		Connection connection = DatabaseConncetion.dbConnction();
		String deleteSqlQuery = "DELETE  EMPLOYEESCHEMA1.EMPLOYEE WHERE EMPLOYEE_ID = ?";
		
		try {
			PreparedStatement preparestatement = connection.prepareStatement(deleteSqlQuery);
			preparestatement.setInt(1, employeeId);
			preparestatement.executeUpdate();
			System.out.println("delete query ---->"+deleteSqlQuery);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public List<Employee> findAllEmploye(){
		Connection connection = DatabaseConncetion.dbConnction();
		String selectQuery = "SELECT * FROM EMPLOYEESCHEMA1.EMPLOYEE";
		return null;
		
		}

}
