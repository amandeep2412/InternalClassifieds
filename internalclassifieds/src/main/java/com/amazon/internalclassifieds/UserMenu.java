package com.amazon.internalclassifieds;

import com.amazon.internalclassifieds.model.Users;

public class UserMenu extends Menu{

	private static UserMenu usermenu = new UserMenu();
	
	public static UserMenu getInstance() {
		return usermenu;
	}
	
	public void showMenu() {
		System.out.println("1: Register");
		System.out.println("2: Login");
		System.out.println("3: Cancel");
		System.out.println("Enter your choice: ");
		int initialChoice = Integer.parseInt(scanner.nextLine());
		boolean result = false;
		
		Users user = new Users();
		switch (initialChoice) {
		case 1:
			manageUser.login(user);
			break;
		case 2:
			manageUser.register();
			break;
		case 3:
			System.out.println("Thank you for using Internal Classifieds App");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
