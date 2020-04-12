package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PayGrade {
	
	WebDriver driver;
	@FindBy(xpath="//a[@href='#'][@id='menu_admin_Job']")
	WebElement Job;
	@FindBy(xpath="//a[text()='Pay Grades']")
	WebElement PayGrades;
	@FindBy(xpath="//input[@name='btnAdd']")
	WebElement Addbtn;
	@FindBy(xpath="//input[@name='payGrade[name]']")
	WebElement Inputfield;
	@FindBy(xpath="//input[@name='btnSave']")
	WebElement Savebtn;
	@FindBy(xpath="//input[@value='Add']")
	WebElement Add;
	@FindBy(xpath="//input[@name='payGradeCurrency[currencyName]']")
	WebElement Currency;
	@FindBy(xpath="//input[@name='payGradeCurrency[minSalary]']")
	WebElement MinSal;
	@FindBy(xpath="//input[@name='payGradeCurrency[maxSalary]']")
	WebElement MaxSal;
	@FindBy(xpath="//input[@name='btnSaveCurrency']")
	WebElement SaveCurrency;
	@FindBy(name="btnCancel")
	WebElement Cancel;
	@FindBy(id="ohrmList_chkSelectAll")
	WebElement Checkbox;
	@FindBy(xpath="//input[@value='Delete']")
	WebElement Delete;
	@FindBy(xpath="//input[@value='Ok'][@class='btn']")
	WebElement Ok;
	@FindBy(xpath="//li[@class='ac_even ac_over']")
	WebElement INR;
	
	public PayGrade(WebDriver driver) {
		this.driver=driver;
			PageFactory.initElements(driver,this);
}
	//to add new paygrade
	public void AddPaygrade()
	{
		Job.click();
		PayGrades.click();
		Addbtn.click();
		Inputfield.sendKeys("Programmer Analyst Trainee");//adds paygrade type
		Savebtn.click();
		Add.click();
		Currency.sendKeys("inr");//selects inr option
		INR.click();
		MinSal.sendKeys("40000");//selects min salary
		MaxSal.sendKeys("60000");//selects max salary
		SaveCurrency.click();
	}
	//to Delete the paygrade
	public void DeletePaygrade()
	{
		//Job.click();
		//PayGrades.click();
		Cancel.click();
		Checkbox.click();//selects the paygrade
		Delete.click();
		Ok.click();
	}
}
