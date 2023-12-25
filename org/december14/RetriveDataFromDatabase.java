package org.december14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class RetriveDataFromDatabase {

	public void getData() {
		DatabaseConnection dbConnection = new DatabaseConnection();

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = dbConnection.dBConnection();
//			System.out.println("Connected");
			statement = connection.createStatement();
//			System.out.println("Statement");
			resultSet = statement.executeQuery("Select * from corenuts.employee1");
//			System.out.println(resultSet);
			while(resultSet.next()) {
//				System.out.println("Id : "+resultSet.getInt("Id"));
//				System.out.println("Name : "+resultSet.getString("Emp_Name"));
//				System.out.println("Dept : "+resultSet.getString("Dept"));
//				System.out.println("Salary : "+resultSet.getFloat("Salary"));
				
				System.out.println("Id : "+resultSet.getInt(1));
				System.out.println("Name : "+resultSet.getString(2));
				System.out.println("Dept : "+resultSet.getString(3));
				System.out.println("Salary : "+resultSet.getFloat(4));
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	public static void main(String[] args) {
		
		RetriveDataFromDatabase retriveDataFromDatabase = new RetriveDataFromDatabase();
		retriveDataFromDatabase.getData();
	}
	

}
