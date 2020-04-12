package com.Stepdefinition;

import com.pages.OrangeHRM_LeavesPage;
import com.pages.OrangeHRM_LoginPage;
import com.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_CancelLeave extends Wrapperclass{                       
	
	
	OrangeHRM_LoginPage Login;
	OrangeHRM_LeavesPage Cancel;
	@Given("^The user opens browser and opens OrangeHRM site$")
	public void the_user_opens_browser_and_opens_OrangeHRM_site() throws Throwable {
		Browser_Launch("chrome");
	}

	@When("^The user login to the website$")
	public void the_user_login_to_the_website() throws Throwable {
		Login = new OrangeHRM_LoginPage(driver);
		Login.DetailsEntry();
	    Login.ClickLogin();
	}

	@When("^The user will search for a particular leave$")
	public void the_user_will_search_for_a_particular_leave() throws Throwable {
	    Cancel = new OrangeHRM_LeavesPage(driver);
		//Cancel.SearchLeave();	
	}

	@Then("^The user will cancel the leave and save the changes$")
	public void the_user_will_cancel_the_leave_and_save_the_changes() throws Throwable {
		Cancel = new OrangeHRM_LeavesPage(driver);
		//Cancel.CancelLeave();
	    Quit();
	}

	
}
