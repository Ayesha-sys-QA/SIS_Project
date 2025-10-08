package com.sis.testbase;

import com.sis.pages.AddEmployeePageElements;
import com.sis.pages.DashboardPageElements;
import com.sis.pages.EmployeeListPageElements;
import com.sis.pages.LoginPageElements;
import com.sis.pages.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass {

	
	public static LoginPageElements loginPage;
	public static DashboardPageElements dashboardPage;
	public static AddEmployeePageElements addEmployeePage;
	public static PersonalDetailsPageElements personalDetailsPage;
	public static EmployeeListPageElements employeeListPage;
	
	
	public static void initialize()
	{
		loginPage = new LoginPageElements();
		dashboardPage = new DashboardPageElements();
		addEmployeePage = new AddEmployeePageElements();
		personalDetailsPage = new PersonalDetailsPageElements();
		employeeListPage = new EmployeeListPageElements();
	}

}
