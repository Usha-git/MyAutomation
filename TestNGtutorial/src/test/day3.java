package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@AfterSuite
	public void afsuite()
	
	{
		System.out.println("I m the last");
	}
	@Test
	public void login()
	{
		System.out.println("HI hello1");
	}
	@BeforeMethod
	public void bflogin()
	{
		System.out.println("BF method");
	}
	@AfterMethod
	public void aflogin()
	{
		System.out.println("AF method");
	}
	@Test
	public void ADlogin()
	{
		System.out.println("HI hello2");
	}
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("I m the one");
	}
	@Test
	public void SSOlogin()
	{
		System.out.println("HI hello3");
	}

}
