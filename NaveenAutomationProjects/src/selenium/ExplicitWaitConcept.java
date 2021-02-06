package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//applicable for all the elements..globally declaration///wait 30 sec for other elements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		clickOn(driver,driver.findElement(By.xpath("//*[@name='login']")),20);//login
		

	}
	
public static void clickOn(WebDriver driver,WebElement locator,int timeout)
{
	new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(locator));
	locator.click();
}
}
