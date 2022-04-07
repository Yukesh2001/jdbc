package com.revature.fsd.app;

import java.util.Scanner;

import com.revature.fsd.app.handler.MainMenuHandler;

public class App {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		MainMenuHandler.display();
		scanner.close();
	}
}
