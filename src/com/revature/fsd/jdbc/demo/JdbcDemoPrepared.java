package com.revature.fsd.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemoPrepared {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/learndb", "root", "password");
			PreparedStatement statement = connection.prepareStatement("select * from department where id = ?");
		) {
			statement.setInt(1, 2);
			try(ResultSet rs = statement.executeQuery();) {
				while (rs.next()) {
					System.out.println(rs.getString("name"));
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getErrorCode() + " " + e.getMessage());
		}
	}

}
