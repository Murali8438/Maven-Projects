package com.pom_Runner;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.PomClass.Home_page;
import com.PomClass.PageObjectModel;
import com.baseClass.NewBaseClass;

public class Runner extends NewBaseClass {

	public static WebDriver driver = NewBaseClass.browserLaunch("chrome");
	
	public static PageObjectModel pom = new PageObjectModel(driver);
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		get("http://automationpractice.com/index.php");
			
		max();
		
		movetoelement(pom.getHp().getHover());
		
		click(pom.getHp().getCasuall());
		
		thread();
		
		click(pom.getHp().getSize());
		
		click(pom.getHp().getHover2());
		
		click(pom.getHp().getCart());
		
		thread();
		
		click(pom.getHp().getCheckout());
		
		thread();
		
		clear(pom.getHp().getCount());
		
		sendKey(pom.getHp().getCount(), "5");
		
		click(pom.getHp().getProcced());
		
		sendKey(pom.getHp().getEmail(), "muralik091@gmail.com");
		
		click(pom.getHp().getCreat());
		
		thread();
		
		sendKey(pom.getHp().getMail(), "muralik091@gmail.com");
		
		sendKey(pom.getHp().getPass(), "Muralikumar@98");
		
		click(pom.getHp().getLogin());
		
		sendKey(pom.getHp().getMess(), "good to use this site");
		
		click(pom.getHp().getProcess());
		
		click(pom.getHp().getClick());
		
		click(pom.getHp().getShip());
		
		click(pom.getHp().getPay());
		
		click(pom.getHp().getOrder());

		javascript("window.scrollBy(0,400)");
		
		screenshot("C:\\Users\\This PC\\eclipse-workspace\\Maven_Project\\screenshot1//final.png");
		


		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	

}
