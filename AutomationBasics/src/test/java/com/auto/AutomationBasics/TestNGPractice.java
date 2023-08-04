package com.auto.AutomationBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is After test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod 
	public void afterMethod() {
		System.out.println("This is After Method");
	}
	
	@Test(priority = 1)
	public void firstTest() {
		System.out.println("This is First Test");
	}
	
	@Test(priority =0)
	public void secondTest() {
		System.out.println("This is Second Test");
	}
	

}
