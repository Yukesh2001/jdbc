package com.revature.fsd.app.handler;

import java.util.List;

import com.revature.fsd.app.model.Department;
import com.revature.fsd.jdbc.dao.DepartmentDao;

public class DepartmentHandler {
	
	public static void displayDepartments() {
		DepartmentDao dao = new DepartmentDao();
		List<Department> departments = dao.findAll();
		System.out.println("Departments");
		System.out.println();
		System.out.printf("%4s %-40s\n", "Id", "Name");
		System.out.printf("%4s %-40s\n", "==", "====");
		departments.forEach(System.out::println);
		System.out.println();
		MainMenuHandler.display();
	}

}
