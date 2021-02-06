import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//to delete all cookies
		//driver.manage().deleteCookieNamed("sessionKey");//to delete one cookies with name 
	
		
		driver.get("https://www.guru99.com/first-webdriver-script.html");
		
		
		//to the screenshot need to cast the driver object to the TakesScreenshot method 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//passing the parameter as a file that means get the output as file format
//to copy the file from the src object to our local machine
		FileUtils.copyFile(src,new File("D://screenshot.png"));
	}

}
