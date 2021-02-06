package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTest()
	{
		super();//It will call TestBase()
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		testUtil=new TestUtil();
		contactsPage=new ContactsPage();
		loginPage=new LoginPage();// It should return next landing page object
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	//test cases should be independent each other
	//before each test case ---lounch the browser and login again
	//@test will execute 
	//after each test case ---close the browser 
	@Test(priority=1)
	public void verifyHomePageTitle()
	{
		String homePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home Page Title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest()
	{
		testUtil.SwitchToFrame();
		Assert.assertTrue(homePage.VerifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest()
	{
		testUtil.SwitchToFrame();
		contactsPage=homePage.clickOnContactsLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
