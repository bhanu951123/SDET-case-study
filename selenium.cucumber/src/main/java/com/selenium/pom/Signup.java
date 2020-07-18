package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	
	private WebDriver driver;
	//private WebElement element;
	
	

	
	
	public Signup(WebDriver driver) {
		this.driver =driver;
		// Below one is needed when we use FindBy
		PageFactory.initElements(driver, this); 
		
	}
	
	By signup= By.xpath("//*[@id='login-block']/div/ul/li[1]/a");
	
	By firstname = By.xpath("//*[@id='registration_firstname']");
	
	By lastname = By.xpath("//*[@id='registration_lastname']");
	
	By email = By.cssSelector("#registration_email");
	
	//By username = By.cssSelector("#username");
	//By password = By.cssSelector("#pass1") ;
	//By confirmpasword =By.xpath("//*[@id='pass2']");
	
	@FindBy(css ="#username")
	WebElement username;
	
	
	@FindBy(css ="#pass1")
	WebElement password ;
	
	
	@FindBy(xpath = "//*[@id='pass2']" )
	WebElement confirmpasword;
	
	@FindBy(css="#registration_phone")
	WebElement phone;
		
	By register =By.xpath("//*[@id='registration_submit']");
	
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/p[1]")
	WebElement confirmation_message;
	
	public WebElement signup()
	{
		return driver.findElement(signup);
	}
	
	public WebElement firstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement lastname()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement confirmpasword()
	{
		return confirmpasword;
	}
	
	public WebElement register()
	{
		return driver.findElement(register);
	}
	
	public WebElement phone()
	{
		return phone;
	}
	
	public WebElement confirmation_message()
	{
		return confirmation_message;
	}
	
}
