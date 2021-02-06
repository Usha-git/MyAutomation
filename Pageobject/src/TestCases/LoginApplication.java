package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

public class LoginApplication {
     @Test
	public void login()
	//Login page clss implemented in normal page object pattern style
	//Home page class implemented in page factory methods
	
	{
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
 		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage re=new RediffLoginpage(driver);
		re.EmailId().sendKeys("Hello");
		re.Password().sendKeys("Hello");
		//re.Submit().click();
		re.Home().click();
		
		RediffHomepage rh=new RediffHomepage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		
		
	}

	
	}


