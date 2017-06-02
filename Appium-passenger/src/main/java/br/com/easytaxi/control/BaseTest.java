package br.com.easytaxi.control;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public abstract class BaseTest {

	public static AndroidDriver<AndroidElement> driver;
	
	public final Location GPS_SAO = new Location(-23.541008, -46.733843, 726);	
	//public final Location GPS_Santiago = new Location(-33.447487, -70.673676, 726);
    //public final Location GPS_Lima = new Location(-12.046374, -77.042793, 726);
	


	@BeforeMethod
	public void setUP() throws Exception {

		File classpathRoot = new File(System.getProperty("user.dir"));
		File app = new File(classpathRoot, "apk/passenger-10.12.5.1645-homolog.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "0431042688");
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.2");
		//capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
		capabilities.setCapability("appPackage", "br.com.easytaxi.homolog");
		capabilities.setCapability("appActivity", "br.com.easytaxi.Launcher");
		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.setLocation(GPS_SAO);
		//driver.setLocation(GPS_Santiago);
		//driver.setLocation(GPS_Lima);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
