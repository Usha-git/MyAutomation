package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	
		WebDriver driver;
		
		public RediffLoginpage(WebDriver driver)
		{
			this.driver=driver;
		}
		
	By username=By.xpath("//*[@id=\"login1\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By signin=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");
	By home=By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Submit()
	{
		return driver.findElement(signin);
	}
	public WebElement Home()
	{
		return driver.findElement(home);
	}
	}


