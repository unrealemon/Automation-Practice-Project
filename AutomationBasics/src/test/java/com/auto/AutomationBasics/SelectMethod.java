package com.auto.AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.*;
public class SelectMethod extends BaseDriver {
	
	String Url = "https://www.amazon.com/";
	
	@Test
	public void selectMethod() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(Url);
		WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(selectDropdown);
		select.selectByIndex(5);
		
		Thread.sleep(2000);
		
		select.selectByValue("search-alias=baby-products-intl-ship");
		
		Thread.sleep(2000);
		
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		
	}
	
	

}
