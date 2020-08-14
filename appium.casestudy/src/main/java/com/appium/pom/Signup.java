package com.appium.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Signup {

	public static AndroidDriver <AndroidElement> driver=null;
	
	public Signup(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	
	
	public  WebElement dismiss()
	{
		return driver.findElement(By.xpath("//*[@text='Dismiss']"));
	}
	
	public WebElement signin()
	{
		return driver.findElement(By.xpath("//*[@text='Sign in']"));
	}
	
	public WebElement proceed()
	{
		return driver.findElement(By.xpath("//*[@text='Continue with Google']"));
	}
	
	public WebElement email()
	{
		return driver.findElement(By.xpath("//*[@text='bhanusprakash@gmail.com']"));
	}
	
	
}
