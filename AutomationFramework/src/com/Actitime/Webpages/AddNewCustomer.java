package com.Actitime.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.utilLibrary.SuperTestScript2;

public class AddNewCustomer {
	
	
	@FindBy(name="name")
	private WebElement customerName;
	
	@FindBy(xpath="//input[@value='Create Customer']")
private WebElement createCustomer;
	
	public AddNewCustomer()
	{
		PageFactory.initElements(SuperTestScript2.driver, this);
	}
	
	public void enterCustomername(String customername)
	{
		
		customerName.sendKeys(customername);
	}
	public void clickOnCreatebutton()
	{
		createCustomer.click();
	}
	
}

