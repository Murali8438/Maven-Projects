package com.PomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	public WebDriver driver;

	@FindBy(xpath=("//a[text()='Women']"))

	private WebElement hover;

	@FindBy(xpath=("//a[text()='Casual Dresses']"))
	
	private WebElement casuall ;
	
	@FindBy(xpath=("//*[@id=\"layered_id_attribute_group_3\"]"))
	
	private WebElement size ;
	
	@FindBy(xpath=("//*[@id=\"center_column\"]/ul/li/div"))
	
	private WebElement hover2 ;
	
	@FindBy(xpath=("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]"))
	
	private WebElement cart ;
	
	@FindBy(xpath=("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"))

	private WebElement checkout  ;
	
	@FindBy(xpath=("//input[@class='cart_quantity_input form-control grey']"))
	
	private WebElement count  ;
	
	@FindBy(xpath=("//*[@id=\"center_column\"]/p[2]/a[1]"))
	
	private WebElement procced  ;
	
	@FindBy(xpath=("//input[@id='email_create']"))
	
	private WebElement email  ;

	@FindBy(id=("SubmitCreate"))
	
	private WebElement creat  ;

	@FindBy(id=("email"))
	
	private WebElement mail ;
	
	@FindBy(id=("passwd"))
	
	private WebElement pass ;
	
	@FindBy(id=("SubmitLogin"))
	
	private WebElement login ;

	@FindBy(name=("message"))
	
	private WebElement mess ;

	@FindBy(name=("processAddress"))
	
	private WebElement process ;

	@FindBy(id=("cgv"))
	
	private WebElement click ;

	@FindBy(name=("processCarrier"))
	
	private WebElement ship ;

	@FindBy(className=("bankwire"))
	
	private WebElement pay ;

	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getCasuall() {
		return casuall;
	}



	public WebElement getSize() {
		return size;
	}



	public WebElement getHover2() {
		return hover2;
	}



	public WebElement getCart() {
		return cart;
	}



	public WebElement getCheckout() {
		return checkout;
	}



	public WebElement getCount() {
		return count;
	}



	public WebElement getProcced() {
		return procced;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getCreat() {
		return creat;
	}



	public WebElement getMail() {
		return mail;
	}



	public WebElement getPass() {
		return pass;
	}



	public WebElement getLogin() {
		return login;
	}



	public WebElement getMess() {
		return mess;
	}



	public WebElement getProcess() {
		return process;
	}



	public WebElement getClick() {
		return click;
	}



	public WebElement getShip() {
		return ship;
	}



	public WebElement getPay() {
		return pay;
	}



	public WebElement getOrder() {
		return order;
	}



	@FindBy(xpath=("//*[@id=\"cart_navigation\"]/button"))
	
	private WebElement order ;

	

	
	
	
	public WebElement getHover() {
		return hover;
	}



	public Home_page(WebDriver driver1) {

		this.driver = driver1;

		PageFactory.initElements(driver, this);

	}

}
