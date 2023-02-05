package com.amazon.internalclassifieds.controller;

import java.util.List;
import java.util.Scanner;

import com.amazon.internalclassifieds.db.UserDAO;
import com.amazon.internalclassifieds.db.passwordEncryptor;
import com.amazon.internalclassifieds.model.Users;

public class UserManagement {

	private static UserManagement manageUser = new UserManagement();
	passwordEncryptor encryptor = passwordEncryptor.getInstance();
	UserDAO userdao = new UserDAO();
	Users user = new Users();
	
	
	public static UserManagement getInstance() {
		return manageUser;
	}
	
	private UserManagement() {
		/*Users user = new Users();
		user.name = "Amandeep Kaur";
		user.phone = "+91 9876543210";
		user.email = "aman@example.com";
		user.password = "aman123";
		user.address = "BLR 14";
		user.userType = 1;
		user.userStatus = 1; //1-active, 0-inactive
		
		UserDAO userdao = new UserDAO();
		userdao.insert(user);
		*/
		
	}
	
	public boolean login(Users user) {
		boolean result = false;
		String sql = "Select * from Users where email='"+user.email+"'AND password='"+encryptor.encryptor(user.password)+"'";
		List<Users> users = userdao.retrieve(sql);
		
		if(users.size()>0) {
			Users u = users.get(0);
			user.name = u.name;
			user.phone = u.phone;
			user.email = u.email;
			user.password = u.password;
			user.address = u.address;
			user.userType =u.userType;
			user.userStatus = u.userStatus;
			return true;
		}
		return false;
	}
	
	public boolean register() {
		user.getDetails(user);
		user.userType = 2;
		user.userStatus = 1;
		return userdao.insert(user)>0;
	}
	
	
	
}
