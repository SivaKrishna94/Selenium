package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchEmp {
	
	 WebDriver driver;
		@FindBy(xpath="//*[@id=\"menu_admin_UserManagement\"]")
		WebElement USERMANAGEMENT;
		@FindBy(xpath="//*[@id=\"menu_admin_viewSystemUsers\"]")
		WebElement USERS;				
		@FindBy(xpath=" //*[@id=\"searchSystemUser_userName\"]")
	    WebElement USERNAME;
		@FindBy(xpath="//*[@id=\"searchBtn\"]")
		WebElement SEARCH;
		@FindBy(xpath="//a[text()='linda.anderson']")
		WebElement Open;
		@FindBy(xpath="//input[@value='Edit']")
		WebElement Edit;
		@FindBy(name="systemUser[chkChangePassword]")
		WebElement Checkbox;
		@FindBy(id="systemUser_password")
		WebElement pwd;
		@FindBy(id="systemUser_confirmPassword")
		WebElement cpwd;@FindBy(xpath="//*[@id=\"btnSave\"]")
		WebElement Save;
		
		public SearchEmp(WebDriver driver) {
			this.driver=driver;
		  PageFactory.initElements(driver,this);
		}
		//to searches for an employee
			public void Search()
			{
			USERMANAGEMENT.click();
			USERS.click();
			USERNAME.sendKeys("linda.anderson");//enters the name 
			SEARCH.click();
			}
			
			//to change the password
			public void Changepwd()
			{
				Open.click();
				Edit.click();
				Checkbox.click();
				pwd.sendKeys("9618577594");//enters the password
				cpwd.sendKeys("9618577594");//confirms the password
				Save.click();
			}
			
	
}
