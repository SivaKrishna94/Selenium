package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Excel;

public class OrangeHRM_LoginPage {
	
	WebDriver driver;
	@FindBy(name="txtUsername")
	WebElement Username;
	@FindBy(name="txtPassword")
	WebElement Password;
	@FindBy(name="Submit")
	WebElement LoginBtn;
	@FindBy(id="welcome")
	WebElement welcome;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public OrangeHRM_LoginPage(WebDriver driver) {
		this.driver=driver;
	  PageFactory.initElements(driver,this);
	}
	
	//to pass parameters from feature file to login
	public void username(String un)
	{
		Username.sendKeys(un);
	}
	public void password(String pw)
	{
		Password.sendKeys(pw);
		}
	
	//to pass username and password
	public void DetailsEntry()
		{
			Username.sendKeys("Admin");
			Password.sendKeys("admin123");
			}
	//to click on login button
		public void ClickLogin()
		{
			LoginBtn.click();
		}
		
		//to click on logout button 
		public void Logout()
		{
			welcome.click();
			logout.click();
		}
}


