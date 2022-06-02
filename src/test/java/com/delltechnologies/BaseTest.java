package com.delltechnologies;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
		protected WebDriver driver = null;
		protected LoginPage loginpage = null;
		
		public WebDriver getWebDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();	
				return driver;
				
				
				
			}


}
