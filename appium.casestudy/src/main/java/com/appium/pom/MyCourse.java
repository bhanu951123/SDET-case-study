package com.appium.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyCourse {

public static AndroidDriver <AndroidElement> driver=null;
	
	public MyCourse(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	public WebElement mycourse() {
		
		   return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"My courses\").instance(0))");
	}
	
	public WebElement getstarted() {
		
		return driver.findElement(By.xpath("//*[@text='Edit']"));
	}
	
	public WebElement course_selection() {
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Arithmetic\").instance(0))");
	}
	
	public WebElement done() {
		return driver.findElement(By.xpath("//*[@text='Done']"));
	}
}
