package mavenacademy.ExtreamReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {

ExtentReports extent;

@BeforeTest

public void config()

{

String path=System.getProperty("user.dir")+"\\reports\\index.html";

ExtentSparkReporter reporter=new ExtentSparkReporter(path);

reporter.config().setReportName("Web Automation Result");

reporter.config().setDocumentTitle("Test Results");

extent=new ExtentReports();

extent.attachReporter(reporter);

extent.setSystemInfo("Tester", "Usha Naik");

}

@Test

public void initialDemo()

{

ExtentTest test=extent.createTest("initial Demo");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/");

System.out.println(driver.getTitle());
driver.close();
test.fail("Result do not match");

extent.flush();

}

}