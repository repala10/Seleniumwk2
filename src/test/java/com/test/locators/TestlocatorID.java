package com.test.locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestlocatorID 
{

     @Test
	public  void main() {
	}
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000); 
		WebElement username =driver.findElement(By.id("txtUsername"));
		WebElement password =driver.findElement(By.id("txtPassword"));
		WebElement login =driver.findElement(By.id("btnLogin"));
		// xpath
		//WebElement time=driver.findElement(null)
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		//Thread.sleep(5000);
		login.click();   
	}

}




