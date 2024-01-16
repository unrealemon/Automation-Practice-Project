package com.auto.AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollHandling extends BaseDriver{
	
	String Url = "https://www.amazon.com/";
	
	@Test
	public void scrollTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(Url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll to a specific location
		WebElement location1 = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
		js.executeScript("arguments[0].scrollIntoView()", location1);
		Thread.sleep(5000);
		
		//scroll up
		js.executeScript("window.scrollTo(0,0)" );
		Thread.sleep(5000);
		
		//scroll down
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
		Thread.sleep(5000);
		
		
		
	}

}
