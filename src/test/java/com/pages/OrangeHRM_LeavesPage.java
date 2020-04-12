package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_LeavesPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//b[text()='Leave']")
	WebElement Leave;
	@FindBy(xpath="//a[text()='Assign Leave']")
	WebElement AssignLeave;
	@FindBy(name="assignleave[txtEmployee][empName]")
	WebElement nameInput;
	@FindBy(xpath="//select[@name='assignleave[txtLeaveType]']")
	WebElement Leavetype;
	@FindBy(xpath="//option[@value='1']")
	WebElement Vacation;
	@FindBy(id="assignleave_txtFromDate")
	WebElement Alfrm;
	@FindBy(linkText="14")
	WebElement Date3;
	@FindBy(id="assignleave_txtToDate")
	WebElement Alto;
	@FindBy(linkText="14")
	WebElement Date4;
	
	@FindBy(id="assignBtn")
	WebElement Assign;
	@FindBy(xpath="//input[@id='confirmOkButton']")
	WebElement ok;
	
	public OrangeHRM_LeavesPage(WebDriver driver) {
		this.driver=driver;
			PageFactory.initElements(driver,this);
}
	//to assign leave
	public void AssignLeave()
	{
		Leave.click();
		AssignLeave.click();
		nameInput.sendKeys("Thomas Fleming");//enters person name 
		nameInput.submit();
		Leavetype.click();
		Vacation.click();//enters leave type
		Leavetype.click();
		Alfrm.click();
		Date3.click();//selects date of leave
		Alto.click();
		Date4.click();
	}
	//to confirm leave
	public void ConfirmLeave()
	{
		Assign.click();
		Assign.click();
		//ok.click();

	}
}
	