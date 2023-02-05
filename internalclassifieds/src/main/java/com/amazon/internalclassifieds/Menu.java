package com.amazon.internalclassifieds;

import java.util.Scanner;

import com.amazon.internalclassifieds.MenuFactory;
import com.amazon.internalclassifieds.controller.UserManagement;

public class Menu {

	Scanner scanner = new Scanner(System.in);
	UserManagement manageUser = UserManagement.getInstance();
	public void showMainMenu() {
		while (true) {
			try {
				System.out.println("1: Admin");
				System.out.println("2: User");
				System.out.println("3. Cancel");
				
				System.out.println("Select an option");
				int choice = Integer.parseInt(scanner.nextLine());
				
				if(choice==3) {
	        		System.out.println("Thank you for using Internal Classifieds app");
	        		break;
	        	}
				try {
					MenuFactory.getMenu(choice).showMenu();
				} catch (Exception e) {
					System.out.println("Something went wrong: "+e);
				}
			} catch (Exception e) {
				System.err.print("Invalid Input");
			}
		}
	}
	
	public void showMenu() {
		System.out.println("Showing Menu...............");
	}
	
}
