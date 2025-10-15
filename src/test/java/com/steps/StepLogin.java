package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepLogin {
	   WebDriver driver;
		LoginPages login;
	@Given("User on the Flipkart homepage")
	public void user_on_the_flipkart_homepage() {
		
		  driver=new ChromeDriver();
		    driver.get("https://www.flipkart.com/");
		     login=new LoginPages(driver);
		     System.out.println("Done");
	    
	}

	@When("User hover over the login button")
	public void user_hover_over_the_login_button() {
	    login.hoverOverElement();
	    System.out.println("Clicked");
	}

	@Then("the login dropdown should be displayed")
	public void the_login_dropdown_should_be_displayed() {
	    System.out.println("login dropdown displayed");
	    driver.quit();
	}
}
