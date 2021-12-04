/**
 * 
 */
package com.test.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author c.repalaa
 *
 */
public class Loginpage 
{
WebDriver driver;
//Locators
By username=By.id("txtUsername");
By password=By.name("txtPassword");
By loginButton=By.xpath("/input[@name='Submit']\"");
By forgotYourNames = By.xpath("//a[contains(text(),'Forgot your password?')]");

//constructor invoked at the time of object creation, pass driver chrome/firefox/safari..
	public Loginpage(WebDriver driver) 
	{
		this.driver = driver;
	}
		
	
	
		// Automation actions/methods
		public void typeUserName()
		{
			driver.findElement(username).sendKeys("Admin");
			
		}
		public void typePassword()
		{
			driver.findElement(password).sendKeys("admin123");
			
		}
		public void clickOnLoginButton()
		{
	driver.findElement(loginButton).click();
			
		}

	




		
		
		
		
		

//Actions  methods 
}
