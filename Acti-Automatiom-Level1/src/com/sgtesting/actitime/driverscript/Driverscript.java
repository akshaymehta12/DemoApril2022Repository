package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.testslevel1.Customers;
import com.sgtesting.actitime.testslevel1.Homepage;
import com.sgtesting.actitime.testslevel1.Initialize;
import com.sgtesting.actitime.testslevel1.LoginLogout;
import com.sgtesting.actitime.testslevel1.Projects;
import com.sgtesting.actitime.testslevel1.Tasks;
import com.sgtesting.actitime.testslevel1.Users;

public class Driverscript {

	public static void main(String[] args) {
		try
		{
			//Create User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Homepage.minimizeFlyOutWindow();
			Users.createUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeapplication();

			//Modify User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Homepage.minimizeFlyOutWindow();
			Users.createUser();
			Users.ModifyUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//create Customer Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Homepage.minimizeFlyOutWindow();
			Customers.createCustomer();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//Modify Customer Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Homepage.minimizeFlyOutWindow();
			Customers.createCustomer();
			Customers.modifyCustomer();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//Create Project Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//Modify Project Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Projects.modifyProject();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//Create Task Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Tasks.createTasks();
			Tasks.importTasks();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
