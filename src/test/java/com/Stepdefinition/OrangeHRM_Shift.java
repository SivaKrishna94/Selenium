package com.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.OrangeHRM_HomePage;

import com.pages.OrangeHRM_LoginPage;
import com.utilities.Wrapperclass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Shift extends Wrapperclass {

	OrangeHRM_HomePage Shift;
	OrangeHRM_LoginPage Login;
	private static Logger logger = (Logger) LogManager.getLogger(OrangeHRM_Shift.class);
	@Given("^The user opens browser and opens OrangeHRM website$")
	public void the_user_opens_browser_and_opens_OrangeHRM_website() throws Throwable {
		Browser_Launch("chrome");
		logger.debug("Chrome is launched");
	}

	@When("^The user login to the site$")
	public void the_user_login_to_the_site() throws Throwable {
		Login = new OrangeHRM_LoginPage(driver);
		Login.DetailsEntry();
	    Login.ClickLogin();
	    logger.info("User successfully logged in");
	}

	@Then("^The user will add a new work shift$")
	public void the_user_will_add_a_new_work_shift() throws Throwable {
	    Shift = new OrangeHRM_HomePage(driver);
		Shift.CreateShift();
		logger.info("User successfully creates a shift");
	}

	@Then("^The user will add members into the shift and save and delete the shift$")
	public void the_user_will_add_members_into_the_shift_and_user_will_nagivated_to_the_next_page() throws Throwable {
		Shift = new OrangeHRM_HomePage(driver);
		Shift.Addmem();
		//Shift.DayShift();
		logger.info("User successfully adds members into the shift");
		screenshot("src/main/resources/Screenshots/AddShift.png");
		Shift.DeleteShift();
		logger.info("User successfully deletes the shift");
		screenshot("src/main/resources/Screenshots/DeleteShift.png");
		Quit();
	}


}
