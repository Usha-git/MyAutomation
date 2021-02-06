
package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	//pre condition 
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setup system properties");
	}

	@BeforeClass//
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}
	
	@BeforeMethod//
	public void enterURL() {
		System.out.println("enter URL");
	}
	@BeforeTest
	public void login()
	{
		System.out.println("login method");
	}
//test cases
	@Test//
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	//post condition
	@AfterMethod//
	public void logOut()
	{
		System.out.println("logout from app");
	}
	@AfterClass//
	public void closebrowser()
	{
		System.out.println("Close Browser");
		
	}
	@AfterTest//
	public void deleteAllCookies()
	{
		System.out.println("Delete cookies");
	}
	@AfterSuite//
	public void generateTestReport()
	{
		System.out.println("Generate Report");
	}
	

}
