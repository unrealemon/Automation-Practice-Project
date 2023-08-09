package com.auto.AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommands extends BaseDriver{
	
	String Url = "https://www.daraz.com.bd/";
	
	@Test
	public void browserCommandTest() throws InterruptedException
	{
	
		driver.manage().window().maximize();
		driver.get(Url);
		
		System.out.println("First Title: "+driver.getTitle());
		System.out.println("First URL: "+driver.getCurrentUrl());
		Thread.sleep(2000);
		
		WebElement SignUp = driver.findElement(By.xpath("//div[@id='anonLogin']"));
		SignUp.click();
		Thread.sleep(2000);
		
		System.out.println("Second Title: "+driver.getTitle());
		System.out.println("Second URL: "+driver.getCurrentUrl());
	}

}
