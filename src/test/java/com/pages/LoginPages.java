package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	WebDriver driver;
	 public LoginPages(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	 @FindBy(xpath="//a[@href='/account/login?ret=/']")
	 WebElement mouseHover;
	 
	 public void hoverOverElement() {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(mouseHover).perform();
	    }
	
	  
}

