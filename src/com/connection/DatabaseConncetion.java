package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConncetion {

	public static Connection dbConnction() {
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/employeedatabase?searchpath=employeeschema", "postgres", "admin");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (connection != null) {
			System.out.println("ok ");
		} else {
			System.out.println("no connection");
		}

		return connection;

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * DatabaseConncetion.dbConnction(); }
	 */

}
