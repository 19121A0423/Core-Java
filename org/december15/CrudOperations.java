package org.december15;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CrudOperations {
	
//	@Test
	public void createTable() {
		
		Connection connection = null;
		Statement statement = null;
		connection = DatabaseConnection.dBConnection();
		try {
			statement = connection.createStatement();
			String query = "create table Student( Id int primary key, Name varchar(50) not null, phoneno bigint not null);";
			int result = statement.executeUpdate(query);
			System.out.println(result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseConnection.close(connection, statement);
		}
		
	}
	
	
//	@Test
	public void insertRecords() {
		
		Connection connection = null;
		Statement statement = null;
		connection = DatabaseConnection.dBConnection();
		try {
			statement = connection.createStatement();
			String query = "insert into student values(1,'Krishna',9492772382)";
			statement.executeUpdate(query);
			statement.executeUpdate("insert into student values(2,'Devi',8327817019)");
			statement.executeUpdate("insert into student values(3,'Lakshmi',7569634257)");
			statement.executeUpdate("insert into student values(4,'Raji',9390145041)");
			statement.executeUpdate("insert into student values(5,'Geetha',9876543210)");
			System.out.println("records inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseConnection.close(connection, statement);
		}
		
	}
	
//	@Test
	public void updateRecords() {
		
		Connection connection = null;
		Statement statement = null;
		connection = DatabaseConnection.dBConnection();
		try {
			statement = connection.createStatement();
			int result = statement.executeUpdate("update student set name = 'Rajeswari' where id=4");
			System.out.println(result +" records updated");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseConnection.close(connection, statement);
		}
		
	}
	
//	@Test
	public void deleteRecords() {
		
		Connection connection = null;
		Statement statement = null;
		connection = DatabaseConnection.dBConnection();
		try {
			statement = connection.createStatement();
			int result =statement.executeUpdate("delete from student where id=5");
			System.out.println(result +" record deleted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseConnection.close(connection, statement);
		}
		
	}
	
	@Test
	public void fetchData() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DatabaseConnection.dBConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("Select * from corenuts.student");
			List<Student> studentList=new ArrayList<>();
			Student student = null;
			while(resultSet.next()) {
				student = new Student();
				int id=resultSet.getInt(1);
				String name=resultSet.getString("name");
				long phone = resultSet.getLong(3);
				
				student.setId(id);
				student.setName(name);
				student.setPhone(phone);
				
				studentList.add(student);
			}
			System.out.println(studentList.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.close(connection, statement);
		}

	}
	

}
