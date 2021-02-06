import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("input#username")).sendKeys("usha");
		driver.findElement(By.cssSelector("input#password")).sendKeys("24234");
		driver.findElement(By.cssSelector("input#Login")).click();
	

	}

}
