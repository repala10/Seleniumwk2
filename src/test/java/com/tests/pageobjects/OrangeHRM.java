/**
 * 
 */
package com.tests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.packages.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * @author c.repalaa
 *
 */
public class OrangeHRM
{

	
	@Test
	  public void VerifyValidLogin() {
		  
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  // LoginPage object creation - parameter driver is passed here
		  Loginpage login = new Loginpage(driver);
		  
		  // LoginPage methods called here
		  login.typeUserName();
		  login.typePassword();
		  login.clickOnLoginButton();
		  
		  driver.quit();
		  
		  
	  }
	  
	}
	 

