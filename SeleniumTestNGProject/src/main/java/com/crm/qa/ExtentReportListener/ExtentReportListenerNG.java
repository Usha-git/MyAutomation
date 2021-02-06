package com.crm.qa.ExtentReportListener;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportListenerNG  {


	static ExtentTest test;
	static ExtentReports report;
	
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	


	}

}
