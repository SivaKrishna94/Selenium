package com.Stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.core.Logger;

import com.pages.OrangeHRM_LoginPage;
import com.pages.SkillPage;
import com.utilities.Excel;
import com.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkillSet extends Wrapperclass{

	OrangeHRM_LoginPage Login;
	SkillPage Skill;
	Excel Excel=new Excel();
	private static Logger logger = (Logger) LogManager.getLogger(SkillSet.class);
	@Given("^user launch the given browser$")
	public void user_launch_the_given_browser() throws Throwable {
	   Browser_Launch("chrome");
	   logger.debug("Chrome is launched");
	  
	}
	@When("^the user login to the home page$")
	public void the_user_login_to_the_home_page() throws Throwable {
	    Login = new OrangeHRM_LoginPage(driver);
	    Login.DetailsEntry();
	    Login.ClickLogin();
	    logger.info("Username and password were entered");
	  }

	@Then("^the user will add a new skill$")
	public void the_user_will_add_a_new_skill() throws Throwable {
		Skill = new SkillPage(driver);
		Skill.AddSkill();
		screenshot("src/main/resources/Screenshots/AddSkill.png");
		logger.info("The skill is added");
	}

	@Then("^the user will delete the skill$")
	public void the_user_will_delete_the_skill() throws Throwable {
		Skill = new SkillPage(driver);
		Skill.DeleteSkill();
		screenshot("src/main/resources/Screenshots/DeleteSkill.png");
		logger.info("The skill is deleted");
		Quit();
	}

}
