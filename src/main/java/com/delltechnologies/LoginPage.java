package com.delltechnologies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	@FindBy(xpath="//a[@class='mh-myaccount-btn mh-flyout-link']")
	private WebElement btnsignin;
	@FindBy(xpath="//a[@class='mh-btn mh-btn-primary navigate']")
	private WebElement btnsignin1;
	
	
	
	

	
	
 public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);
	}
 public void clickOnSigninButton() {
	 this.btnsignin.click();
 }
 public void clickOnSignButton() {
	 this.btnsignin1.click();
 }
}
	


