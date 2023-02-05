package com.amazon.internalclassifieds;

import java.util.Scanner;

import com.amazon.internalclassifieds.model.Users;

public class AdminMenu extends Menu {

	private static AdminMenu adminmenu =new AdminMenu();
	
	public static AdminMenu getInstance() {
		return adminmenu;
	}
	
	public void showMenu() {
		Users adminUser = new Users();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email: ");
		adminUser.email = scanner.nextLine();
		System.out.println("Enter the password");
		adminUser.password = scanner.nextLine();
		boolean result = manageUser.login(adminUser);
		
		if(result && adminUser.userType ==1) { 
			System.out.println("admin login successful");
		}
	}
}
