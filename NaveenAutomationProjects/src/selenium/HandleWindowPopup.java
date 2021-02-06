package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/ul[1]/li[3]/a")).click();
		 
		 Thread.sleep(2000);
		 
		 Set<String> handler=driver.getWindowHandles();
		 //For handling window we are using the iterator in the selenium
		Iterator<String> it=handler.iterator();//iterator id pointing to the object not a location
		String ParentWindowId=it.next();
		System.out.println("parent window id"+ParentWindowId);
		
		String ChildWindowId=it.next();
		System.out.println("child window id"+ChildWindowId);
		
		driver.switchTo().window(ChildWindowId);
		Thread.sleep(2000);
		System.out.println("child window title"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window title"+driver.getTitle());
		
		
		 

	}

}
