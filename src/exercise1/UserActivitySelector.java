package exercise1;

import java.util.Scanner;

public class UserActivitySelector {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any activity of the following");
		System.out.println("login");
		System.out.println("signup");
		System.out.println("terminate_program");
		System.out.println("main_menu");
		System.out.println("about_app");
		String choice = sc.nextLine();
		
		switch (choice) {
		case "login" : 
			System.out.println("Please, Enter your username");
			break;
		case "signup" : 
			System.out.println("Welcome!");
			break;
		case "terminate_program" : 
			System.out.println("Thank you! Good byye!");
			break;
		case "main_menu" : 
			System.out.println("Main menu");
			break;
		case "about_app" : 
			System.out.println("This app is created by me with support of @It-Bulls.com");
			break;
		default:
			System.out.println("Please, enter one of these values : login, signup, terminate_program, main_menu, about_app");  
			
		}
		
	}

}
