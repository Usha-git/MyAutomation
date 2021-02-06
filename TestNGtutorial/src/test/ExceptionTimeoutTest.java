package test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
//	@Test(timeOut=1000)
//	public void infinetLoop()
//	{
//		int i=1;
//		while(i==1){
//			System.out.println(i);
//		}
//	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test()
	{
		String x="100A";
		Integer.parseInt(x);
	}

}
