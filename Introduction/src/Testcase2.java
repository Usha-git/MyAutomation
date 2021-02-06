import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ushan\\Documents\\Automation\\Rahul Shetty\\edgedriver_win64\\msedgedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		driver.getTitle();
		System.out.println(driver.getTitle());

	}

}
