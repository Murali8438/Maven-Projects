package com.PomClass;

import org.openqa.selenium.WebDriver;

public class PageObjectModel {

	private WebDriver driver;
	private Home_page hp;

	public PageObjectModel(WebDriver driver2) {
		
		this.driver = driver2;
		
		
	}


	public Home_page getHp() {
		hp = new Home_page(driver);
		
		return hp;
	}
	
	
	
	
}
