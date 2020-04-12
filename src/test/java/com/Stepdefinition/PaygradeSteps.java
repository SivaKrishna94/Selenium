package com.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.OrangeHRM_LoginPage;
import com.pages.PayGrade;
import com.utilities.Wrapperclass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaygradeSteps extends Wrapperclass{
	
	OrangeHRM_LoginPage Login;
	PayGrade Pay;
	private static Logger logger = (Logger) LogManager.getLogger(PaygradeSteps.class);

	@Given("^The user opens browser and opens OrangeHRM$")
	public void the_user_opens_browser_and_opens_OrangeHRM_site() throws Throwable {
		Browser_Launch("chrome");
		logger.debug("Chrome is launched");
	}

	@When("^The user login to website$")
	public void the_user_login_to_the_website() throws Throwable {
		Login = new OrangeHRM_LoginPage(driver);
		Login.DetailsEntry();
	    Login.ClickLogin();
	    logger.info("User successfully logged in");
	}

	@And("^The user will add a new Paygrade$")
	public void the_user_will_add_a_new_Paygrade() throws Throwable {
	    Pay = new PayGrade(driver);
	    Pay.AddPaygrade();
	    screenshot("src/main/resources/Screenshots/AddPaygrade.png");
	    logger.info("User successfully created a paygrade");
	}

	@Then("^The user will delete the Paygrade$")
	public void the_user_will_delete_the_Paygrade() throws Throwable {
		Pay = new PayGrade(driver);
		Pay.DeletePaygrade();
		screenshot("src/main/resources/Screenshots/DeletePaygrade.png");
		logger.info("User successfully deleted a paygrade");
		Quit();
	}

}
