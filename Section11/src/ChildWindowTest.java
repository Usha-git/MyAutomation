import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();// To go to child window
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());//to print the current title window
		
		Set<String>ids=driver.getWindowHandles();//To get all the windows ids
		Iterator<String> it = ids.iterator();// to iterate the ids
		String parentid=it.next();// to go to next id
		String chilId=it.next();//to go to child id
		driver.switchTo().window(chilId);// switch to child window
		System.out.println("After Switching");
		System.out.println(driver.getTitle());//print the title of the child window
		
		driver.switchTo().window(parentid);//  go back to parent window
		System.out.println(" Switching Back to Parent");
		System.out.println(driver.getTitle());// to print the title of the parent window
	}

}
