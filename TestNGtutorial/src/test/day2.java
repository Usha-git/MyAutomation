package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@AfterTest
	public void lloan()
	{
		System.out.println("I will execute last");
	}
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("My Loan");
	}
	@BeforeTest
	public void myloans()
	{
		System.out.println("I  will execute first");
	}

}
