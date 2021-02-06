package test;

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
	@BeforeSuite//1
	public void setUp()
	{
		System.out.println("@BeforeSuite---setup system properties");
	}
	@BeforeTest//2
	public void launchBrowser()
	{
		System.out.println("@BeforeTest---Launch Browser");
	}

	@BeforeClass//3
	public void login()
	{
		System.out.println("@BeforeClass---Login to app");
	}
	
	@BeforeMethod//4
	public void enterURL() {
		System.out.println("@BeforeMethod---enter URL");
	}
	
	/* @BeforeMethod
	 * @Test--1
	 * @AfterMethod
	 * @BeforeMethod
	 * @Test--2
	 * @AfterMethod
	 */
//test cases
	@Test//5
	public void googleTitleTest() {
		System.out.println("@Test---Google Title Test");
	}
	@Test
	public void Searchtext()	
	{
		System.out.println("@Test---Search Text");
	}
	@Test
	public void GoogleLogo()
	{
		System.out.println("@Test---Google Logo");
	}
	//post condition
	@AfterMethod//6
	public void logOut()
	{
		System.out.println("@AfterMethod---logout from app");
	}
	@AfterClass//7
	public void closebrowser()
	{
		System.out.println("@AfterClass--Close Browser");
		
	}
	@AfterTest//8
	public void deleteAllCookies()
	{
		System.out.println("@AfterTest---Delete cookies");
	}
	@AfterSuite//9
	public void generateTestReport()
	{
		System.out.println("@AfterSuite---Generate Report");
	}
	
}
