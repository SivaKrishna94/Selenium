package com.TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Feature/Testcase.feature",
plugin = {"pretty", "html:reports/cucumber-html-report",
		"json:target/cucumber.json",
		"junit:target/cucumber.xml"},
tags = {"@TC04_OrangeHRM"},
glue = {"com.Stepdefinition"},
monochrome = true
		)
public class Cancel_Leave_Runner {

}
