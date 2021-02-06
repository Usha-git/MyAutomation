import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		//driver.findElement(By.id("username")).sendKeys("usha");
		driver.findElement(By.cssSelector("#username")).sendKeys("usha");
		//driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123456");;
		//driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

	}

}
