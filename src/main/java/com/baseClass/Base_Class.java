package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {

	public static void clickOnElement(WebElement element) {
		
		element.click();
		
	}

	
	public static void passKeys(WebElement element , String name) {

		element.sendKeys(name);
		
	}

	public static WebDriver driver;
	
	public static WebDriver driver_change(String enter) {

		if (enter.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
			
		}
		else if (enter.equalsIgnoreCase("gecko")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "\\driver\\geckoedriver.exe");

			 driver = new FirefoxDriver();
			
		
		}
		return driver;
	}


	
	
	public static void assign(String url) {

		driver.get(url);
	}
	
	
}
