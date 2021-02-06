package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		
			System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://www.google.com");
			//take screenshot and store as a file
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//now copy the screenshot to the desired location 
			//for this we need to add Apache Common IO jar
			 FileUtils.copyFile(src, new File("G:\\RahulShetty\\NaveenAutomationProjects\\src\\selenium\\google.png"));
			
			
			
			
		
		
		
	}

}