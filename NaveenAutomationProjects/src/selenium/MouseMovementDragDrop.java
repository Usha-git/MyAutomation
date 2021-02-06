package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Mouse over to the element and then click
public class MouseMovementDragDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/menu/");
		
		Actions action =new Actions(driver);
		
		
		action.moveToElement(driver.findElement(By.linkText("Main Item 2"))).build().perform();//perfom the action 
		
		driver.findElement(By.linkText("Sub Item")).click();
		
		
		

	}

}
