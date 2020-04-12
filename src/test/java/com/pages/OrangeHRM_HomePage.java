package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_HomePage {

WebDriver driver;
	
@FindBy(xpath="//a[@href='#'][@id='menu_admin_Job']")
WebElement Job;
@FindBy(xpath="//a[@href='/index.php/admin/workShift']")
WebElement Workshift;
@FindBy(xpath="//input[@name='btnAdd'][@value='Add']")
WebElement AddShift;
@FindBy(xpath="//input[@type='text']")
WebElement ShiftName;
@FindBy(id="workShift_workHours_from")
WebElement WorkshiftFrm;
@FindBy(id="workShift_workHours_to")
WebElement WorkshiftTo;
@FindBy(xpath="//option[@value='5']")
WebElement Member1;
@FindBy(xpath="//option[@value='1']")
WebElement Member2;
@FindBy(xpath="//option[@value='7']")
WebElement Member3;
@FindBy(xpath="//option[@value='3']")
WebElement Member4;
@FindBy(xpath="//a[@id='btnAssignEmployee']")
WebElement AddMem;
@FindBy(xpath="//input[@id='btnSave']")
WebElement Save;
@FindBy(xpath="//a[text()='Day Shift']")
WebElement DayShift;
@FindBy(xpath="//input[@id='ohrmList_chkSelectAll']")
WebElement checkbox;
@FindBy(xpath="//input[@type='submit'][@value='Delete']")
WebElement Delete;
@FindBy(xpath="//input[@type='button'][@value='Ok'][@class='btn']")
WebElement OK;
@FindBy(xpath="//input[@type='button'][@value='Cancel']")
WebElement Cancel;

	public OrangeHRM_HomePage(WebDriver driver) {
		this.driver=driver;
			PageFactory.initElements(driver,this);
}		
	//For creating a new shift
		public void CreateShift()
		{
			Job.click();
			Workshift.click();
			AddShift.click();
			ShiftName.sendKeys("Day Shift");//enters the shift name 
			Select drpHours = new Select(WorkshiftFrm);
			Select drpHours1 = new Select(WorkshiftTo);
			drpHours.selectByValue("09:00");//Selects 9:00 hours
			drpHours1.selectByValue("18:00");//selects 18:00 hours
		}
		//to Add members into the shift
		public void Addmem()
		{
			Member1.click();//selects member
			Member2.click();
			Member3.click();
			Member4.click();
			AddMem.click();//Adds the selected member
			Save.click();
		}
		//to Delete the shift
		public void DeleteShift()
		{
			checkbox.click();//Clicks the check box
			Delete.click();//deletes the shift
			OK.click();
		}
		}
