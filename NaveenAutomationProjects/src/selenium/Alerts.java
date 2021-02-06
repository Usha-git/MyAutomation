package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String 	text="Rahul";
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//to select and pass the key in the text box
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(text);
		
		//to click on the alert button
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		//to display the text in the pop up(alert) page 
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		System.out.println(driver.switchTo().alert().getText());// To capture the alert message.	
		Thread.sleep(2000);
		
		//to switch to the pop up and accept the alert like click on ok button
		driver.switchTo().alert().accept();// click  on ok button
		//alert().accept();
		
		
		// clicking on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		
		// canceling javascript alert
		//System.out.println(driver.switchTo().alert().getText());// To capture the alert message.
		//String text1=alert().getText();
		//System.out.println(text1);
		String text1=driver.switchTo().alert().getText();
		System.out.println(text1);
		if(text1.equals("Hello , Are you sure you want to confirm?"))
		{
			System.out.println("Alert is correct");
		}
		else
		{
			System.out.println("Alert is not correct");
		}
		driver.switchTo().alert().dismiss();// click on cancel button
		//alert().dismiss();
	}

}
