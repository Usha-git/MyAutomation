package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	 public static long PAGE_LOAD_TOMEOUT=50;
	 public	static long IMPLICIT_WAIT=50;

	 
	 public void SwitchToFrame()
	 {
		 driver.switchTo().frame("mainpanel");
	 }
}
