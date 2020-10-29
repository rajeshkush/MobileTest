package org.TestMobileapp.org.TestMobileapp;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_Vertical_Scroll {
	 //
//		WebDriver driver;
		static AppiumDriver<MobileElement> driver;
		
//		static AndroidDriver<AndroidElement> driver;
//		AndroidDriver driver11;
		 
		
//		 static AppiumDriver<MobileElement> driver;
		public static void main(String[] args) {

//			// TODO Auto-generated method stub
			try {
				
				verticalScrolling();

			}catch(Exception exp) {
				
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}
			
				}
		
		public static void verticalScrolling() throws MalformedURLException  {
			
			 
		DesiredCapabilities cap = new DesiredCapabilities();
//		//127.0.0.1:62001 // Google Nexus 5 - 6.0.0 - API 23 - 1080x1920_3
		//cap.setCapability("Automation_name", "192.168.65.110:5555");

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");	
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.65.107:5555");
		

		cap.setCapability(MobileCapabilityType.APP, "D:\\KOPLAYER\\download\\API_Demos.apk");
		cap.setCapability("appPackage","com.example.android.apis");
		cap.setCapability("appActivity","com.example.android.apis.view.ScrollView2");
//		cap.setCapability("appActivity","com.example.android.apis.view.HorizontalScrollView1");

		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("clearSystemFiles", "true");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		

		//driver = new AndroidDriver<AndroidElement> (url,cap);
		driver = new AndroidDriver<MobileElement> (url,cap);
		
		System.out.println("Application Started..Hi..");

		System.out.println("Scroll Vertically till Button 22" );

		// FindElement  
		 MobileElement listiten = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
		         ".scrollIntoView(new UiSelector().text(\"BUTTON 22\"))"));
//
//		System.out.println("Scroll Vertically click()" );
		// setAsHorizontalList
		// FindElement
//		MobileElement listiten = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//		        "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
//		         ".scrollIntoView(new UiSelector().text(\"platforms\"))"));
		System.out.println(listiten.getLocation());
	
		}  
		
	}




