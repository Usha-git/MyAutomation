package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;

	public ContactsPageTest() {
		super();// It will call TestBase()
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();// It should return next landing page object
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.SwitchToFrame();
		//contactsPage=homePage.clickOnContactsLink();
		
	}
//	@Test(priority=1)
//	public void verifyContactsPageLabel()
//	{
//		Assert.assertTrue(contactsPage.verifyContactsLabel(),"Contacts label is missing on the page");
//		
//	}
//	
//	@Test(priority=2)
//	public void  selectSingleContactsTest()
//	
//	{
//		contactsPage.selectContactsByName("fff dwsd");
//	
//	}
	@DataProvider
	public void getTestData()
	{
		
	}
	@Test
	public void validateCreateNewContact()
	{
		homePage.clickOnNewContact();
		contactsPage.createNewContact("Miss", "usha", "madev", "naik", "Evolvus");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}