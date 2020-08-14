package com.appium.testcase;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.capabilities.capabilitie;
import com.appium.pom.Signup;
import com.appium.pom.CourseChallenge;
import com.appium.pom.LangRegion;
import com.appium.pom.MyCourse;
import com.appium.pom.NativetoWebapp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class TestRunnerkhanacademy extends capabilitie {
	
	public static AndroidDriver <AndroidElement> driver=null;
	public static Signup signup=null;
	public static LangRegion lang=null;
	public static MyCourse course=null;
	public static CourseChallenge challenge=null;
	public static NativetoWebapp nativetowebapp=null;
	
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		
		System.out.println("*****************  In BeforeTest *************");
		driver=capability(appPackage, appActivity, deviceName, chromeDriver);		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		signup=new Signup(driver);
		lang=new LangRegion(driver);
		course=new MyCourse(driver);
		challenge=new CourseChallenge(driver);
		nativetowebapp=new NativetoWebapp(driver);
		
	}
	
	@Test
	public void khanacadamey() throws IOException, InterruptedException {
			
		//TestCase 01 To login with EmailId and reach homepage of Khan Academy
		
		Thread.sleep(2000);
		signup.dismiss().click();
		Thread.sleep(2000);
		signup.dismiss().click();
		Thread.sleep(2000);
		signup.signin().click();
		signup.proceed().click();
		signup.email().click();
		//signup.dismiss().click();
		
		System.out.println("TestCase 01 To login with EmailId and reach homepage of Khan Academy Completed");
		
		//TestCase 02 Scroll To select Language and select language,Region and back to Course Page 
		
		lang.language().click();
		Thread.sleep(2000);
		lang.english().click();
		lang.select_english().click();
		Thread.sleep(2000);
		lang.back().click();
		lang.region().click();
		lang.back_home().click();
		
		System.out.println("TestCase 02 To Scroll to Select Language Option and select 'English Language' and 'Universal Region' and "
				+ "back to Homepage for Course Selection");
		
		//TestCase 03 MyCourse selection and move to home page
		
		course.mycourse();
		course.getstarted().click();
		course.course_selection().click();
		Thread.sleep(3000);
		course.done().click();
		
		System.out.println("TestCase 03 MyCourse selection Completed and moved to home page");
		
		//TestCase 04 Take Course Challenge and back to home page
		
		challenge.select_arithmetic().click();
		challenge.course_challenge().click();
		Thread.sleep(3000);
		challenge.back().click();
		challenge.back().click();
		
		System.out.println("TestCase 04 Take Course Challenge and back to home page Completed");
		
		//TestCase 05 Moving from Native App to WebApp
		
		nativetowebapp.settings().click();
		nativetowebapp.view_progress_bar().click();
		
		//Moving from native app to WebApp to know Progress bar
		Thread.sleep(3000);
		//You will get at appium.io//http://appium.io/docs/en/writing-running-appium/web/hybrid/
		Set<String> contextNames = driver.getContextHandles(); //Identify how many context are there e.g Native/Web
		for (String contextName : contextNames) {
		    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		//driver.context("WEBVIEW_chrome");
		Thread.sleep(5000);
		nativetowebapp.my_progress();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		
		System.out.println("TestCase 05 Moving from Native App to WebApp to check Course Progress");
		
	}
	
	 @AfterMethod
	  public void afterTest() {
	  
			System.out.println("*****************  In AfterTest *************");
			driver.quit();
	  }

}
