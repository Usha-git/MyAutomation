import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		
		//Xpath:
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("usha");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("62535612");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//CSS Selector:tagname[attribute='value']
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("usha");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("62535612");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		
		
		
	

	}

}
