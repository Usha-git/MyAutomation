import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//broken link is nothing but broken url
		// step 1 is get all the links tied up to the links using selenium by using href
		//java methods will call URL's and gets u the status code
		//if status code is greater than the 400 then its not working->link which tied to url is broken	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[2]/a")).getAttribute("href");
	HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();//to get the link and open that link connection
	conn.setRequestMethod("HEAD");//it will call the url and give the response
	conn.connect();
	int resCode=conn.getResponseCode();// to get the code like 200,400
	System.out.println(resCode);
	}

}
