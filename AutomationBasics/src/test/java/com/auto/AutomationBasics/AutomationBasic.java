package com.auto.AutomationBasics;

import org.testng.annotations.Test;

public class AutomationBasic extends BaseDriver {
	
	@Test
	public void firstTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}
	

}
 