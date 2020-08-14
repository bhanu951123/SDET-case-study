package com.appium.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CourseChallenge {
public static AndroidDriver <AndroidElement> driver=null;
	
	public CourseChallenge(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	public WebElement select_arithmetic() {
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Arithmetic\").instance(0))");
	}
	
	public WebElement course_challenge() {
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Take Course Challenge\").instance(0))");
	}
	
	public WebElement lets_go() {
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Let's go\").instance(0))");
	}
	
	public WebElement enter_value() {
		return driver.findElement(By.className("android.widget.EditText"));
	}
	
	public WebElement check() {
		return driver.findElement(By.xpath("//*[@text='Check']"));
	}
	
	public WebElement back() {
		return driver.findElement(By.className("android.widget.ImageView"));
	}

}
