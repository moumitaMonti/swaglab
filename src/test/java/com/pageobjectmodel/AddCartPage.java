package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {

	
	WebDriver driver;
	
	String mp1;
	String mp2;
	double p3;
	double p1;
	public AddCartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	public void getUsername() {
		username.sendKeys("standard_user");
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public void getPassword() {
		password.sendKeys("secret_sauce");
	}
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	public void getLogin() {
		login.submit();
	}
	@FindBy(xpath="(//button[contains(text(),'ADD TO CART')])[5]")
	WebElement lowestaddcart;
	public void getlowestAddcart() {
		lowestaddcart.click();
	}
	
	@FindBy(xpath="(//div[contains(@class,'inventory_item_price')])[5]")
	WebElement actualPrice;
	public void getActualPrice() {
		String p=actualPrice.getText();
		mp1 = p.replace("$", "");
		 p3=Double.parseDouble(mp1);
		System.out.println(p3);
	}
	
	
	
	@FindBy(xpath="(//button[contains(text(),'ADD TO CART')])[2]")
	WebElement addcart;
	public void getAddcart() {
		
		addcart.click();
	}
	
	@FindBy(xpath="(//div[contains(@class,'inventory_item_price')])[2]")
	WebElement actualPrice2;
	public void getActualPrice2() {
		
	String p2=actualPrice2.getText();
	mp2 = p2.replace("$", "");
  p1=Double.parseDouble(mp2);
	System.out.println(p1);
	}
	
	public void addPrice() {
		
		double TotalActualprice=p1+p3;
		
		System.out.println(TotalActualprice);
		
	}
	
	@FindBy(xpath="//span[@class='fa-layers-counter shopping_cart_badge']")
	
	WebElement cart;
	public void getCart() {
		cart.click();
	}
	
	@FindBy(xpath="(//button[contains(text(),'REMOVE')])[1]")
	WebElement remove;
	public void getRemove() {
		remove.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Continue Shopping')]")
	WebElement continueShopping;
	public void getContinueShopping() {
		continueShopping.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'CHECKOUT')]")
	WebElement chekout;
	public void getCheckout() {
		chekout.click();
	}
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	public void getFirstname() {
		firstname.sendKeys("moumita");
		
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	public void getLastname() {
		lastname.sendKeys("roy");
	}
	

	@FindBy(xpath="//input[@id='postal-code']")
	WebElement zipcode;
	public void getZipcode() {
		zipcode.sendKeys("11372");
	}
	@FindBy(xpath="//input[@class='btn_primary cart_button']")
	WebElement processContinue;
	public void getProcessContinue() {
		processContinue.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'FINISH')]")
	WebElement finish;
	public void getFinish() {
		finish.click();
	}

	@FindBy(xpath="//div[@class='summary_subtotal_label']")
	WebElement expectP;
	public void getexpectP() {
		System.out.println(expectP.getText());
	}
	
}
