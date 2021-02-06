package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//File upload Alerts
public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		//Give the path of the file which u r going to upload
		driver.findElement(By.id("uploadfile_0")).sendKeys("G:\\Selenium_Alerts.txt");
	
	}

}
