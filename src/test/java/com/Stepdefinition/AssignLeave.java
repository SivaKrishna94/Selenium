package com.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.OrangeHRM_LeavesPage;
import com.pages.OrangeHRM_LoginPage;
import com.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssignLeave extends Wrapperclass{
	
	OrangeHRM_LoginPage Login;
	OrangeHRM_LeavesPage Leave;
	private static Logger logger = (Logger) LogManager.getLogger(AssignLeave.class);
	@Given("^The user will opens browser and opens OrangeHRM site$")
	public void the_user_will_opens_browser_and_opens_OrangeHRM_site() throws Throwable {
	   Browser_Launch("chrome");
	   logger.info("Chrome is launched successfully");
	}

	@When("^The user will login to the website$")
	public void the_user_will_login_to_the_website() throws Throwable {
		Login = new OrangeHRM_LoginPage(driver);
		Login.DetailsEntry();
		Login.ClickLogin();
		logger.info("User successfully logged in");
	}

	@When("^The user will enters details of leave$")
	public void the_user_will_enters_details_of_leave() throws Throwable {
	    Leave = new OrangeHRM_LeavesPage(driver);
	    Leave.AssignLeave();
	    logger.info("User successfully entered details of leave");
	}

	@Then("^The user will assign leave$")
	public void the_user_will_assign_leave() throws Throwable {
		Leave = new OrangeHRM_LeavesPage(driver);
		Leave.ConfirmLeave();
		screenshot("src/main/resources/Screenshots/AssignLeave.png");
		logger.info("User successfully assigned a leave");
		Quit();
	}

}
