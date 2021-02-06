package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Demo User')]")
	WebElement usernamelabel;

	@FindBy(xpath = "//a[@title='Contacts']")
	WebElement contactLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks']")
	WebElement tasksLink;

	// initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean VerifyCorrectUserName()
	{
		return usernamelabel.isDisplayed();
		
	}
	
	public ContactsPage clickOnContactsLink() {
		contactLink.click();
		return new ContactsPage();// It should return next landing page object
	}

	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();// It should return next landing page object
	}

	public TasksPage clickOntasksLink() {
		tasksLink.click();
		return new TasksPage();// It should return next landing page object
	}
	
	public void clickOnNewContact()
	{
	Actions action=new Actions(driver);
	action.moveToElement(contactLink).build().perform();
	newContactLink.click();
	
	}
}
