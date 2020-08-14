package com.appium.capabilities;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabilitie {

	protected static String appPackage;
	protected static String appActivity;
	protected static String deviceName;
	protected static String chromeDriver;

	public static AndroidDriver<AndroidElement> capability(String appPackage,String appActivity,String deviceName,String chromeDriver) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader input = new FileReader(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\appium\\capabilities\\global.properties");
		//FileReader input=new FileReader("C:\\Users\\BHANUSANGARAJU\\eclipse-workspace\\maven.appium\\src\\main\\java\\global.properties");
		//C:\Users\BHANUSANGARAJU\eclipse-workspace\appiumcasestudy\src\main\java\khanacademy\appiumcasestudy\global.properties
		Properties property=new Properties();
		property.load(input);
		appActivity=property.getProperty("appActivity");
		appPackage=property.getProperty("appPackage");
		deviceName=property.getProperty("deviceName");
		chromeDriver=property.getProperty("chromeDriver");
		
		
		
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, chromeDriver);
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		return driver;	

	}


}
