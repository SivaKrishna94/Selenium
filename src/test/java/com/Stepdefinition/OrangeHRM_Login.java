package com.Stepdefinition;

import static org.junit.Assert.assertEquals;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.OrangeHRM_LoginPage;
import com.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Login extends Wrapperclass{
	
	OrangeHRM_LoginPage Login;
	private static Logger logger = (Logger) LogManager.getLogger(OrangeHRM_Login.class);
		@Given("^The user launch the given application$")
		public void the_user_launch_the_given_application() throws Throwable {
		   Browser_Launch("chrome");
		   logger.debug("Chrome is launched");
		}

		@When("^The user enters \"([^\"]*)\" and \"([^\"]*)\"$")
		public void the_user_enters_and(String arg1, String arg2) throws Throwable {
		   	Login = new OrangeHRM_LoginPage(driver);
			Login.username(arg1);
			Login.password(arg2);
			logger.info("Username and password were entered");
		}

		@Then("^The user clicks on the login button and user will nagivated to the next page$")
		public void the_user_clicks_on_the_login_button_and_user_will_nagivated_to_the_next_page() throws Throwable {
			Login = new OrangeHRM_LoginPage(driver);
			Login.ClickLogin();
			screenshot("src/main/resources/Screenshots/Login.png");
			logger.info("User successfully logged in");
			String HomeTitle = driver.getTitle();
			assertEquals("OrangeHRM",HomeTitle);
		}
		@Then("^The user will logged out$")
		public void the_user_will_logged_out() throws Throwable {
			Login = new OrangeHRM_LoginPage(driver);
			Login.Logout();
			screenshot("src/main/resources/Screenshots/Logout.png");
			logger.info("User successfully logged out");
			Quit();
		}
	}
