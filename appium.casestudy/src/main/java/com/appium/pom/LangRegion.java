package com.appium.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LangRegion {
	public static AndroidDriver <AndroidElement> driver=null;
	
	public LangRegion(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	public WebElement language() {
		
		   return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Select language\").instance(0))");
	}
	
	public WebElement english() {
		
		return driver.findElement(By.xpath("//*[@text='English']"));
	}
	
	public WebElement select_english() {
		
		return driver.findElement(By.xpath("//*[@text='Device Language']"));
	}
	
	public WebElement back() {
		return driver.findElement(MobileBy.AccessibilityId("Navigate up"));
	}
	
	public WebElement region() {
		return driver.findElement(By.xpath("//*[@text='English (default)']"));
	}
	
	public WebElement back_home() {
		return driver.findElement(By.className("android.widget.ImageView"));
	}

}
