package com.auto.AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementsCommands extends BaseDriver{
	
	String url= "https://demoqa.com/automation-practice-form";
	
	@Test
	 public void webElementsTest() throws InterruptedException{
		 driver.manage().window().maximize();
		 driver.get(url);
		
		 
		 WebElement firstName1 = driver.findElement(By.xpath("//input[@id='firstName']"));
		 firstName1.sendKeys("Emon");
		 Thread.sleep(2000);
		 
		 WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		 firstName.clear();
		 Thread.sleep(2000);
		 
		 WebElement firstName2 = driver.findElement(By.xpath("//input[@id='firstName']"));
		 firstName2.sendKeys("Md. Emon");
		 Thread.sleep(2000);
		
		 
		 WebElement lastName1 = driver.findElement(By.xpath("//input[@id='lastName']"));
		 lastName1.sendKeys("Ali");
		 Thread.sleep(2000);
		 
		 
		 /*WebElement Submit = driver.findElement(By.xpath("//Button[@id='submit']"));
		 Submit.click();
		 Thread.sleep(2000);*/
		 
		 WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		 System.out.println("Attribute value: " + Email.getAttribute("placeholder"));
		 Thread.sleep(2000);
		 
		 WebElement Text = driver.findElement(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
		 String FormValue = Text.getText();
		 System.out.println(FormValue);
		 Thread.sleep(2000);
		 System.out.println("Font size is: "+Text.getCssValue("font-size"));
		 System.out.println("Color Code is: "+Text.getCssValue("color"));
		 
		 if(Email.isDisplayed()) 
		 {
			 Email.sendKeys("emonali.w@gmail.com");
		     Thread.sleep(2000);
	     }
		 else
		      System.out.println("Email is not locatable");
		 
		 /*WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		 dob.click();
		 Thread.sleep(2000);*/
		 
		 WebElement MaleCheckbox = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]"));
		 if(!MaleCheckbox.isSelected())
		 {
			 MaleCheckbox.click();
		     Thread.sleep(2000);
		 }
		 else 
		 
			 System.out.println("Checkbox is selected");
		 
		       
	 }

} 
