package com.delltechnologies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected WebDriver driver = null;
	
	

	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
		
	}



