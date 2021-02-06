package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day4 {
	
	
	@Test(groups={"Smoke"})
	public void ADlogin2()
	{
		System.out.println("HI hello5");
	}
	@AfterClass
	public void SSOlogin3()
	{
		System.out.println("HI hello6");
	}
	@BeforeClass
	public void login1()
	{
		System.out.println("HI hello4");
	}

}
