package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day1 {
	
	@Parameters({"URL"})
	@Test
	public void printurl(String urlname) 
	{
		System.out.println("sfsdfsd");
		System.out.println(urlname);
	}
	
	
	@Test(enabled=false)
	public void webpage() {
		System.out.println("false");
	}
	@Test
	public void Demo() {
		System.out.println("Hello");
	}

	@Test(groups={"Smoke"})
	public void SeconTest() {
		System.out.println("Hello1");
	}
	@Test(dependsOnMethods={"Demo"})
	public void Ademo() {
		System.out.println("Depends");
	}
	@Test(timeOut=4000)
	public void waitfor() {
		System.out.println("Wait for that particular time");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination -username password -good credit history
		//2nd combination -username passward -no credit history
		//3rd combination -fraudulent credit history
		Object[][] data=new Object[3][2];
		//first set
		data[0][0]="firstusername";
		data[0][1]="passward";
		//second set 
		data[1][0]="secondusername";
		data[1][1]="secondusername";
		//third set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassward";
		return data;
		
	}
	@Test(dataProvider="getData")
	public void mydata(String username,String passward)
	{
		System.out.println("Get data from the dataprovider");
		System.out.println(username);
		System.out.println(passward);
	}
}
