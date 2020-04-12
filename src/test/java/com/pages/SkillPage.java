package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillPage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	WebElement Admin;
	@FindBy(id="menu_admin_Qualifications")
	WebElement Qual;
	@FindBy(id="menu_admin_viewSkills")
	WebElement Skills;
	@FindBy(id="btnAdd")
	WebElement Add;
	@FindBy(name="skill[name]")
	WebElement SkillName;
	@FindBy(name="skill[description]")
	WebElement Description;
	@FindBy(id="btnSave")
	WebElement Save;
	@FindBy(id="checkAll")
	WebElement Check;
	@FindBy(id="btnDel")
	WebElement Del;
	
	public SkillPage(WebDriver driver) {
		this.driver=driver;
	  PageFactory.initElements(driver,this);
	}
	//to add a new skill
	public void AddSkill()
	{
		Admin.click();
		Qual.click();
		Skills.click();
		Add.click();
		SkillName.sendKeys("Testing");//enters skill name
		//enters details about skill
		Description.sendKeys("The  employee should have the skill set to test the application");
		Save.click();
	}
	//to delete skill
	public void DeleteSkill()
	{
		Check.click();
		Del.click();
	}
}
