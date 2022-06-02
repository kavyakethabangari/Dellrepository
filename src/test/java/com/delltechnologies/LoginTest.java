package com.delltechnologies;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
	
	  private WebDriver  driver = null;
		
		@BeforeMethod
		public void initMethod() {
			this.driver = this.getWebDriver();
			driver.get("https://www.dell.com");
			this.loginpage  = new LoginPage(driver);

		}
 @Test 
 public void signToDellDechnologies() {
	 this.loginpage.clickOnSigninButton();
	 this.loginpage.clickOnSigninButton();
 }

}
