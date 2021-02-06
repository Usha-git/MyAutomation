package test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void login()
	{
		System.out.println("Login");
		
	}
	@Test(dependsOnMethods="login")
	public void HomePage()
	{
		System.out.println("Home Page");
	}
	@Test(dependsOnMethods="login")
	public void SearchPage()
	{
		System.out.println("Search page");
	}
	@Test(dependsOnMethods="login")
	public void RegPage()
	{
		System.out.println("Reg Page Test");
	}
	

}
