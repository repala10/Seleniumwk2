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
public class Contactdetails 
{
WebDriver driver;
By contactDetail=By.linkText("Contact Details");
By editcontact=By.cssSelector("input#btnSave");
By addresssteet1=By.cssSelector("input#contact_street1");
By cityName=By.xpath("//input[@name='contact[city]']");
By mobileNumber=By.xpath("//input[@name='contact[emp_mobile]']");
By mailId=By.xpath("//label[text()='Work Email']//following-sibling::input[1]");
By savebutton=By.xpath("//input[@value=\"Save\"]");

public Contactdetails(WebDriver driver)
{
	this.driver=driver;
}

public void verifcontactdetails()
{
driver.findElement(contactDetail).click();
}
public  void verifycontact()
{
driver.findElement(editcontact)	.click();
	}

public void verifyAddresstreect()
{
driver.findElement(addresssteet1).sendKeys("bharavunipally");	
}

public void verifycityNAME()
{
driver.findElement(cityName).sendKeys("khammam");
}
public void verifymobileNumber ()
{
driver.findElement(mobileNumber).sendKeys("9848525525");
}
public void  VerfymailId ()
{
driver.findElement(mailId).sendKeys("repalaakhil97@gmail.com");
}
public void verifysavebutton()
{
driver.findElement(savebutton).click();
	}

}
