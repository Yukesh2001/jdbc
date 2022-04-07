package com.revature.fsd.app.handler;

import com.revature.fsd.app.App;

public class MainMenuHandler {
	public static void display() {
		System.out.println("App Main Menu");
		System.out.println("=============");
		System.out.println("1. Display Departments");
		System.out.println("2. Exit App");
		System.out.println("Enter option: ");
		int option = App.scanner.nextInt();
		if (option == 1) {
			DepartmentHandler.displayDepartments();
		}
	}

}
