package com.amazon.internalclassifieds.model;

import java.util.Scanner;

public class Users {

	public int userID;
	public String name;
	public String phone;
	public String email;
	public String password;
	public String address;
	public int userType;
	public int userStatus;
	public String createdOn;
	
	public Users() {
		
	}

	public Users(int userID, String name, String phone, String email, String password, String address, int userType,
			int userStatus, String createdOn) {
		this.userID = userID;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.address = address;
		this.userType = userType;
		this.userStatus = userStatus;
		this.createdOn = createdOn;
	}

	public void getDetails(Users user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = scanner.nextLine();
		if(!name.isEmpty())
			user.name = name;
		System.out.println("Enter Phone: ");
		String phone = scanner.nextLine();
		if(!phone.isEmpty())
			user.phone = phone;
		System.err.println("Enter email: ");
		String email = scanner.nextLine();
		if(!email.isEmpty())
			user.email = email;
		System.out.println("Enter password: ");
		String password = scanner.nextLine();
		if(!password.isEmpty())
			user.password = password;
		System.out.println("Enter the address: ");
		String address = scanner.nextLine();
		if(!address.isEmpty())
			user.address = address;
		
		scanner.close();
	}
	
	@Override
	public String toString() {
		return "Users [userID=" + userID + ", name=" + name + ", phone=" + phone + ", email=" + email + ", password="
				+ password + ", address=" + address + ", userType=" + userType + ", userStatus=" + userStatus
				+ ", createdOn=" + createdOn + "]";
	}
	
	
}
