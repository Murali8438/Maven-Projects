package com.baseClass;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewBaseClass {

	public static Select s ;
	public static Actions ac ;
	public static JavascriptExecutor js ;

	public static WebDriver driver;

	public static WebDriver browserLaunch(String enter) {

		if (enter.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (enter.equalsIgnoreCase("gecko")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\driver\\firefoxdriver.exe");

			driver = new FirefoxDriver();

		}
		return driver;

	}

	public static void sendKey(WebElement element, String key) {

		element.sendKeys(key);

	}

	public static void click(WebElement element) {

		element.click();

	}

	public static void clear(WebElement element) {

		element.clear();

	}

	public static void screenshot(String shot) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(shot);
		FileUtils.copyFile(source, destination);
	}

	public static void close() {

		driver.close();

	}

	public static void quit() {

		driver.quit();
	}

	public static void navigateTo(String enter) {

		driver.navigate().to(enter);
	}

	public static void navigateForword() {

		driver.navigate().forward();
	}

	public static void navigateBack() {

		driver.navigate().back();
	}

	public static void navigateRefresh() {

		driver.navigate().refresh();
	}

	public static void get(String url) {

		driver.get(url);
	}

	public static void getcurenturl() {

		driver.getCurrentUrl();
	}

	public static void getTitel() {

		driver.getCurrentUrl();
	}

	public static void alert() {
		driver.switchTo().alert().accept();
	}

	public static void action(WebElement element) {

		ac=new Actions(driver);
		ac.contextClick(element).build().perform();
		
	}

	public static void movetoelement(WebElement element) {

		ac = new Actions(driver);
		
		ac.moveToElement(element).build().perform();
	}
	
	
	
	
	public static void thread() throws InterruptedException {

		Thread.sleep(2000);
	}

	public static void getselectedopstion(WebElement element) {
		
		s= new Select(element);
		
		List<WebElement> gaso = s.getAllSelectedOptions();
		for (WebElement string : gaso) {
			
			String text = string.getText();
			
			System.out.println(text);
		}
		
	}
	
	public static void isMultiple(WebElement element) {

		s =new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	
	
	public static void max() {

		driver.manage().window().maximize();
	}
	
	
	public static void javascript(String enter) throws InterruptedException {

		 js = (JavascriptExecutor)driver;
		
		thread();
		
		js.executeScript(enter);
		
	}
	
	
	
	
	
	
}
 