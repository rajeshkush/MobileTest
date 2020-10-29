package org.TestMobileapp.org.TestMobileapp;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Amazon_shopping {

//	static DesiredCapabilities cap;
	static AndroidDriver<AndroidElement> driver;
//	static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) {

//		// TODO Auto-generated method stub
		try {
			amazonapk();

		}catch(Exception exp) {
			
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
			}
	
	
	public static void amazonapk() throws MalformedURLException, InterruptedException  {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");	
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.65.107:5555");
		cap.setCapability(MobileCapabilityType.APP, "D:\\KOPLAYER\\download\\Amazon_shopping.apk");
		cap.setCapability("appPackage","com.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("clearSystemFiles", "true");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		

		driver = new AndroidDriver<AndroidElement> (url,cap);
		
		

		//Assert.a
		System.out.println("Application Started..Hi..");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session created ");
		
	
//		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Amazon Shopping");
//		el3.click();
		// click to skip the sign in window 
		MobileElement el5 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/skip_sign_in_button");
		el5.click();

		MobileElement el2 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/rs_search_src_text");
		el2.sendKeys("1 Kg almond");	
		
	
		MobileElement el4 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/rs_search_src_text");
		el4.sendKeys("1 Kg almond");	

		el4.clear();
		MobileElement el8 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/rs_search_src_text");
		
		el8.sendKeys("65 inches TV ");	

		
		el8.sendKeys("65 inches TV ");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		el8.click();
		
		MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
		el9.click();
		

		MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId(" Style: TV Only ");
		el10.click();
		
		driver.navigate().back();
		
		MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId(" Size: 65-Inch ");
		el11.click();
		
		//<MobileElement> els1 = (MobileElement) driver.findElementsById("65-inch");
	
		
		System.out.println("Search mobile pass ");
		
	

	
		
	}
		
	       
	}
	

