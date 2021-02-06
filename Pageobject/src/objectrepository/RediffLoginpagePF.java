package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {
	
	//Page Factory methods

	
		WebDriver driver;
		
		public RediffLoginpagePF(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	/*By username=By.xpath("//*[@id=\"login1\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By signin=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");
	By home=By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");
	*/
		@FindBy(xpath="//*[@id=\"login1\"]")
		WebElement username;
		
		@FindBy(xpath="//*[@id=\"password\"]")
		WebElement password;
		
		@FindBy(xpath="/html/body/div/div[1]/div[1]/div[1]/a")
		WebElement home;
		
		
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Home()
	{
		return home;
	}
	}


