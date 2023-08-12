package com.auto.AutomationBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandling extends BaseDriver{
	
	
	String Url = "https://demoqa.com/alerts";
	
	@Test
	public void alertTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(Url);
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.click();
		alert.accept();
		Thread.sleep(2000);
		
		
		WebElement confirmResult = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println(confirmResult.getText());
		Thread.sleep(2000);
		
		WebElement confirmButton1 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton1.click();
		alert.dismiss();
		Thread.sleep(2000);
		
		
		WebElement confirmResult1 = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println(confirmResult1.getText());
		Thread.sleep(2000);
		
	
		WebElement promtButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promtButton.click();
		Thread.sleep(2000);
		alert.sendKeys("Emon");		
		alert.accept();
		Thread.sleep(2000);
		
		
	}

}
