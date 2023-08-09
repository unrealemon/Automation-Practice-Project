package com.auto.AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationCommands extends BaseDriver{
	
	String Url = "https://www.daraz.com.bd/";
	
	@Test
	public void navigateTest() throws InterruptedException
	{
	  driver.manage().window().maximize();
	  driver.get(Url);
	  
	  WebElement SignUp = driver.findElement(By.xpath("//div[@id='anonLogin']"));
	  SignUp.click();
	  Thread.sleep(2000);
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  
	  driver.navigate().forward();
	  Thread.sleep(2000);
	  
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	}
	

}
