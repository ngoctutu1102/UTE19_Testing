package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator{
	@Test
	public void plus100() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		dc.setCapability("platformName", "android");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", ".Calculator");
		AndroidDriver<AndroidElement> wdr = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		MobileElement el1 = (MobileElement) wdr.findElementById("com.android.calculator2:id/digit_7");
		el1.click();
		MobileElement el2 = (MobileElement) wdr.findElementById("com.android.calculator2:id/digit_5");
		el2.click();
		MobileElement el3 = (MobileElement) wdr.findElementByAccessibilityId("plus");
		el3.click();
		MobileElement el4 = (MobileElement) wdr.findElementById("com.android.calculator2:id/digit_2");
		el4.click();
		MobileElement el5 = (MobileElement) wdr.findElementById("com.android.calculator2:id/digit_5");
		el5.click();
		MobileElement el6 = (MobileElement) wdr.findElementByAccessibilityId("equals");
		el6.click();
		Assert.assertEquals(wdr.findElementById("com.android.calculator2:id/result").getText(),"100");

	}
}
