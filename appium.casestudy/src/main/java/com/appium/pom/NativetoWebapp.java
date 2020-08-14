package com.appium.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NativetoWebapp {
	
public static AndroidDriver <AndroidElement> driver=null;
	
	public NativetoWebapp(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	public WebElement settings() {
		return driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Settings']"));
	}
	
	public WebElement view_progress_bar() {
		return driver.findElement(By.xpath("//*[@text='View progress report']"));
	}
	
	public WebElement my_progress() {
		//return driver.findElement(By.xpath("//*[@text='My progress']"));
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"My progress\").instance(0))");
	}

}
