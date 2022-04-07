package com.revature.fsd.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.app.model.Department;

public class DepartmentDao {

	public List<Department> findAll() {
		String sql = "select * from department";
		List<Department> departments = new ArrayList<>();
		try (
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
		) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Department department = new Department();
				department.setId(rs.getInt("id"));
				department.setName(rs.getString("name"));
				departments.add(department);
			}
		} catch (SQLException e) {
			Util.displayMessage(e);
		}
		return departments;
	}
}
