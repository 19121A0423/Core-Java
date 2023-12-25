package org.december15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class StudentDAO {

//	@Test
	public void insertRecords() {
		Connection connection = null;
		PreparedStatement statement = null;
		connection = DatabaseConnection.dBConnection();
		String query = "insert into student values(?,?,?)";
		try {
			statement = connection.prepareStatement(query);

			statement.setInt(1, 5);
			statement.setString(2, "Geetha");
			statement.setLong(3, 9390145041l);
			statement.executeUpdate();

			statement.setInt(1, 6);
			statement.setString(2, "Anvitha");
			statement.setLong(3, 9876543210l);
			statement.executeUpdate();

			statement.setInt(1, 7);
			statement.setString(2, "Kiran");
			statement.setLong(3, 9000536010l);
			statement.executeUpdate();

			System.out.println("records inserted");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(connection, statement);
		}

	}

//	@Test
	public void updateRecords() {
		
		Connection connection = null;
		PreparedStatement statement = null;
		connection = DatabaseConnection.dBConnection();
		String query = "update student set name=? where id=?";
		try {
			statement = connection.prepareStatement(query);
			
			statement.setString(1, "Raji");
			statement.setInt(2, 4);
			statement.executeUpdate();
			System.out.println("record updated");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseConnection.close(connection, statement);
		}
	}
	
	@Test
	public void deleteRecords() {
		
		Connection connection = null;
		PreparedStatement statement = null;
		connection = DatabaseConnection.dBConnection();
		String query = "delete from student where id=?";
		try {
			statement = connection.prepareStatement(query);
			
			statement.setInt(1, 4);
			statement.executeUpdate();
			System.out.println("record deleted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseConnection.close(connection, statement);
		}
	}

}
