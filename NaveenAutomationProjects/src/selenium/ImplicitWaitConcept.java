package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		
		//wait for 40 sec to load the page...it will wait 40 sec...within 40 sec if its loaded means it will perform the action otherwise ot will through the error
		//If the page is loaded within 2 sec then rest of the 38 sec will be ignored
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//applicable for all the elements..globally declaration///wait 30 sec for other elements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

}
