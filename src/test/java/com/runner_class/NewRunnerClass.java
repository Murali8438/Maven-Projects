package com.runner_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseClass.NewBaseClass;

public class NewRunnerClass extends NewBaseClass {
	
	//public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = browserLaunch("chrome");
		
		get("https://www.amazon.in/");
		
		
		//navigateRefresh();
		
		//getcurenturl();
	
		//getTitel();
		
		//WebElement page = driver.findElement(By.xpath("//*[@id=\\\"nav-xshop\\\"]/a[1]"));
		
		thread();
		
		WebElement deals = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[1]"));
		
		//action(deals);
	
		//doubleclick(deals);
		//drop down select class
		navigateTo("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement name1 = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(name1);
		s.selectByIndex(0);
		s.selectByValue("2");
		s.selectByVisibleText("UFT/QTP");
		s.deselectByValue("3");
		
		getselectedopstion(name1);
		
		isMultiple(name1);
		
		
	
	
	
	
	
	
	
	
	
	}
	
	

}
