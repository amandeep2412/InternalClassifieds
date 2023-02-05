package com.amazon.internalclassifieds;

import com.amazon.internalclassifieds.controller.UserManagement;
import com.amazon.internalclassifieds.db.DB;

/**
 * Hello world!
 *
 */
public class App 
{
	private App() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Internal Classifieds App");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
    public static void main( String[] args )
    {
        Menu menu = new Menu();
        if(args.length>0) {
     	   DB.FILEPATH = args[0];
        }
        
        menu.showMainMenu();
        
        //new Menu().showMainMenu();
    }
}
