package com.runner_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseClass.Base_Class;

public class Day1 extends Base_Class{

	//public static WebDriver driver;
	
	public static void main(String[] args) {

		driver = driver_change("chrome");
		
		driver.get("http://automationpractice.com/index.php");
		
		//assign("http://automationpractice.com/index.php");
		
		WebElement name = driver.findElement(By.className("login"));
		
		//name.click();
		
		clickOnElement(name);
		
		WebElement name1 = driver.findElement(By.id("email"));
	
		//name1.sendKeys("aaabbbcccddd@gmail.com");
		
		passKeys(name1, "aaabbbcccddd@gmail.com");
		
		WebElement name2 = driver.findElement(By.id("passwd"));
		
		//name2.sendKeys("12345678");
		
		passKeys(name2, "12345678");
		
		WebElement name3 = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
	
		//name3.click();
		
		clickOnElement(name3);
		
	}

}
