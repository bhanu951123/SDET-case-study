package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateEmail {
	
	private WebDriver driver;
	
	
	public ValidateEmail(WebDriver driver) {
		this.driver =driver;
		// Below one is needed when we use FindBy
		PageFactory.initElements(driver, this); 
		
	}
	
	@FindBy(xpath="//*[@id='navbar']/ul[2]/li[2]/a/span[2]")
	WebElement dropdown;
	
	@FindBy(xpath="//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p")
	WebElement validate_email;
	
	
	public WebElement dropdown() {
		return dropdown;
	}
	
	public WebElement validate_email() {
		return validate_email;
	}
	

}
