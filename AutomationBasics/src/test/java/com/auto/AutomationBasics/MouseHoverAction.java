package com.auto.AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.*;

public class MouseHoverAction extends BaseDriver {
	
	String Url = "https://www.daraz.com.bd/";
	
	@Test
	
	public void MouseHover() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(Url);
		
		Actions action = new Actions(driver);
		WebElement homeAndLifestyle = driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		action.moveToElement(homeAndLifestyle).perform();
		Thread.sleep(2000);
		
		WebElement homeStationary = driver.findElement(By.xpath("//span[contains(text(),'Stationery & Craft')]"));
		action.moveToElement(homeStationary).perform();
		Thread.sleep(2000);
		
		WebElement homeStationaryReligious = driver.findElement(By.xpath("//span[contains(text(),'Religious Items')]"));
		homeStationaryReligious.click();
		Thread.sleep(2000);
		
		
	
	}
			

}
