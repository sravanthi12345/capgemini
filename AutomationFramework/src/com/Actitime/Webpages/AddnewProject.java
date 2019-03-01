package com.Actitime.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Actitime.utilLibrary.SuperTestScript2;

public class AddnewProject {
	
	@FindBy(name="name")
	private WebElement projectnametextfield;
	
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	@FindBy(xpath="//input[@value='Create Project']")
	private WebElement createProject;
	
	
		public AddnewProject()
	{
		PageFactory.initElements(SuperTestScript2.driver, this);
	}
	
	public void enterProjectname(String projName)
	{
		
		projectnametextfield.sendKeys(projName);
	}
	public void selectCustomerDropdown()
	{
		Select s1=new Select(customerDropdown);
		s1.selectByIndex(1);
	}
	public void clickOnCreateProject()
	{
		createProject.click();
	}
	
		
	
	
	
	
	
	
	
	

}
