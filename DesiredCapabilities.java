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
// This package name of your app (you can get it from apk info app)
// This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
  		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		

		//driver = new AndroidDriver<AndroidElement> (url,cap);
		driver = new AndroidDriver<AndroidElement> (url,cap);
		
}