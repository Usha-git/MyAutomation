import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//1. give me the count of the link in the page 
		// a-tagname
		System.out.println(driver.findElements(By.tagName("a")).size());// to get the links count for the entire page 
		
		// get the count of link present in the footer section u need to limit the driver scope to that particular page 
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//count the link of 1st column
		WebElement columnDriver=footerdriver.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//click on each link and check if the pages are opening
		
		for (int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);//click on the link by holding control button
			//to get each tab title 
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
		
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
		
	}


