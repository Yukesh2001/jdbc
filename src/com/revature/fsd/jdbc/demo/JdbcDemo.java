package com.revature.fsd.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	
	public JdbcDemo() {
		System.out.println("JdbcDemo constructor called");
	}

	public static void main(String[] args) {
		//Class.forName("com.revature.fsd.jdbc.demo.JdbcDemo").newInstance();
		//Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/learndb", "root", "password");
		//Statement statement = connection.createStatement();
		//ResultSet rs = statement.executeQuery("select * from department");
		//while (rs.next()) {
		//	System.out.println(rs.getString("name"));
		//}
	}

}
