import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");//hit url on the browser
		driver.getTitle();
		System.out.println(driver.getTitle());//validate if ur page title is correct
		
		System.out.println(driver.getCurrentUrl());//validate if u r landed on correct url
		//System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
		
		

	}

}
