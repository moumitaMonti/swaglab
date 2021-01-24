package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.AddCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCart extends Base {

	AddCartPage page;

	@Given("^I am on homepage$")
	public void i_am_on_homepage() throws Throwable {
		LaunchBrowser();
		page = PageFactory.initElements(driver, AddCartPage.class);
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		page.getUsername();
		page.getPassword();
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {

		page.getLogin();
	}

	@When("^I add lowest price item$")
	public void i_add_lowest_price_item() throws Throwable {
		
		page.getActualPrice();
		page.getlowestAddcart();
		
	}

	@When("^I add another item$")
	public void i_add_another_item() throws Throwable {
		
		page.getActualPrice2();
		page.getAddcart();
		

		
Thread.sleep(3000);
	}

	@When("^I click on cart$")
	public void i_click_on_cart() throws Throwable {

		page.getCart();
		Thread.sleep(3000);
	}

	@Then("^selected item should be added on cart$")
	public void selected_item_should_be_added_on_cart() throws Throwable {
		WebElement cartpage = driver.findElement(By.xpath("//div[contains(text(),'Your Cart')]"));
		String cartpageText = cartpage.getText();
		System.out.println(cartpageText);
		Assert.assertEquals(cartpageText, "Your Cart");

	}

	@When("^I remove one item$")
	public void i_remove_one_item() throws Throwable {
		page.getRemove();

	}
	@When("^I click continue shopping$")
	public void i_click_continue_shopping() throws Throwable {
page.getContinueShopping();

	}

	
	@When("^I add again other item$")
	public void i_add_again_other_item() throws Throwable {
		page.getAddcart();

	}

	@When("^I click again on cart$")
	public void i_click_again_on_cart() throws Throwable {
		page.getCart();

	}

	@When("^I click on checkout$")
	public void i_click_on_checkout() throws Throwable {
		page.getCheckout();
	}

	@When("^I enter first name$")
	public void i_enter_first_name() throws Throwable {
		page.getFirstname();
	}

	@When("^I enter last name$")
	public void i_enter_last_name() throws Throwable {
		page.getLastname();
	}

	@When("^I enter zipcode$")
	public void i_enter_zipcode() throws Throwable {
		page.getZipcode();
	}

	@When("^I click proceed$")
	public void i_click_proceed() throws Throwable {

page.getProcessContinue();
	}

	@Then("^items added with exact total price$")
	public void items_added_with_exact_total_price() throws Throwable {
		page.addPrice();
		
		page.getexpectP();
		//page.ActualPrice();
		
		  //WebElement actualPrice=driver.findElement(By.xpath(
		 // "(//div[contains(@class,'inventory_item_price')])[5]")); 
		  
		 // String actual=actualPrice.getText(); System.out.println(actual);
		  
		
		
	//	WebElement expectedPrice=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
		  
		 // String expected=expectedPrice.getText(); 
		 // System.out.println(expected);
		// System.out.println(page.addPrice());

//Assert.assertEquals(page.addPrice(),expected);



	}

	@When("^I click finish$")
	public void i_click_finish() throws Throwable {
		page.getFinish();
	}

	@Then("^I get THANK YOU FOR YOUR ORDER message sucessfully$")
	public void i_get_THANK_YOU_FOR_YOUR_ORDER_message_sucessfully() throws Throwable {
		WebElement orderMessage = driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]"));
		String actualMessage = orderMessage.getText();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, "THANK YOU FOR YOUR ORDER");

	}

}
