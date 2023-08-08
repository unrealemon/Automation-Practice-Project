package com.auto.AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorPractice extends BaseDriver{
	
	@Test
	public void testLocators() throws InterruptedException{
		
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us/en");
		Thread.sleep(5000);
		
		/*Locate By id 
		WebElement Bus = driver.findElement(By.id("purpose"));
		Bus.click();
		Thread.sleep(5000);*/
		
		//Locate By name 
		WebElement Bus = driver.findElement(By.name("purpose"));
		Bus.click();
		Thread.sleep(2000);
		
		//Locate By linkText
		WebElement Launch = driver.findElement(By.linkText("Launch"));
	    Launch.click();
		Thread.sleep(2000);
		
		//Locate By class 
		WebElement Send = driver.findElement(By.className("btn"));
	    Send.click();
		Thread.sleep(2000);
		
		//Custom > Tagname [@attribute='value']
		WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("test@emon.com");
		Thread.sleep(2000);
		
		//Locate By css selector > Tagname[attribute='value']
		WebElement Name= driver.findElement(By.cssSelector("input[name='dest-to']"));
		Name.click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
