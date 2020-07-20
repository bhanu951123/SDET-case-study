package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeEmail {

	private WebDriver driver;


	public ComposeEmail(WebDriver driver) {
		this.driver =driver;
		// Below one is needed when we use FindBy
		PageFactory.initElements(driver, this); 

	}

	@FindBy(xpath="//*[@id='navbar']/ul[1]/li[1]/a")
	WebElement homepage;

	@FindBy(xpath="//*[@id='profileCollapse']/div/ul/li[2]/a")
	WebElement compose_email;
	
	@FindBy(xpath="//*[@id='compose_message']/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")
	WebElement sendto;
	
	@FindBy(css="#compose_message_title")
	WebElement subject;
	
	@FindBy(xpath="//*[@aria-describedby='cke_48']")
	WebElement message;
	
	@FindBy(xpath="//*[@type='text']")
	WebElement description;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement send_message;
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/div[1]")
	WebElement acknowledgement;
	
	
	public WebElement homepage() {
		return homepage;
	}
	
	public WebElement compose_email() {
		return compose_email;
	}
	
		
	public WebElement sendto() {
		return sendto;
	}
	
	public WebElement subject() {
		return subject;
	}
	
	public WebElement message() {
		return message;
	}
	
	public WebElement description() {
		return description;
	}
	
	public WebElement send_message() {
		return send_message;
	}
	
	public WebElement acknowledgement() {
		return acknowledgement;
	}
	
	

}
