package com.revature.fsd.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDMLDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/payroll", "root", "password111");
			PreparedStatement statement = connection.prepareStatement("insert into department (name) values (?)");
		) {
			statement.setString(1, "Marketing");
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getErrorCode() + " " + e.getMessage());
		}
	}
}
