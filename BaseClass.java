package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		try {
		
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
		
			} catch(Exception exp) {
						
						System.out.println(exp.getCause());
						System.out.println(exp.getMessage());
						exp.printStackTrace();

			}
		
		
	}
	
	@Test
	public void mobiletest() {
		System.out.println("Amazon Shopping Test  Start here ");
	}
	
	@AfterTest
	public void teardown() {
//		driver.close();
		driver.quit();
		
	}

}
