package com.Stepdefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.OrangeHRM_LoginPage;
import com.pages.SearchEmp;
import com.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchemp extends Wrapperclass{
	
	OrangeHRM_LoginPage Login;
	SearchEmp Search;
	private static Logger logger = (Logger) LogManager.getLogger(Searchemp.class);
	@Given("^The user launches browser and login to the OrangeHRM website$")
	public void the_user_launches_browser_and_login_to_the_OrangeHRM_website() throws Throwable {
	    Browser_Launch("chrome");
	    logger.debug("Chrome is launched");
		Login = new OrangeHRM_LoginPage(driver);
	    Login.DetailsEntry();
	    Login.ClickLogin();
	    logger.info("User successfully logged in");
	   	}

	@When("^User enters Employee details to search$")
	public void user_enters_Employee_details_to_search() throws Throwable {
	    Search = new SearchEmp(driver);
	    Search.Search();
	    screenshot("src/main/resources/Screenshots/EmployeeSearch.png");
	    logger.info("User entered details of employee to search");
	   	}
	
	@Then("^User will open the employee profile and change password$")
	public void user_will_open_the_employee_profile_and_change_password() throws Throwable {
		Search = new SearchEmp(driver);
		Search.Changepwd();
		logger.error("Eventhough password contains 8 charecters,it showed an error");
		screenshot("src/main/resources/Screenshots/Passwordchange.png");
		Quit();
}}

