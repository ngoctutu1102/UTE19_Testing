package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class Research {
	AndroidDriver<AndroidElement> driver = null;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		//Informant driver infor
		//Set environment
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		dc.setCapability("platformName", "android");
		dc.setCapability("appPackage", "com.android.contacts");
		dc.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		dc.setCapability("locationServicesAuthorized", true);
		dc.setCapability("autoGrantPermissions", true);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc); 
	}
	
	@AfterClass
	public void Close() {
		driver.close();
	}
	
	@Test
	public void Search() throws MalformedURLException, InterruptedException {
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Chrome");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.android.chrome:id/search_box_text");
		el2.sendKeys("myworkspace.vn");
		(new TouchAction(driver)).tap(PointOption.point(699, 315)).perform();
		(new TouchAction(driver)).tap(PointOption.point(1004, 282)).perform();
		(new TouchAction(driver)).tap(PointOption.point(824, 571)).perform();
		(new TouchAction(driver)).tap(PointOption.point(423, 1008)).perform();
		(new TouchAction(driver)).tap(PointOption.point(765, 1520)).perform();
		(new TouchAction(driver)).tap(PointOption.point(532, 1375)).perform();
		(new TouchAction(driver)).tap(PointOption.point(903, 1198)).perform();
		(new TouchAction(driver)).tap(PointOption.point(427, 1526)).perform();
		(new TouchAction(driver)).tap(PointOption.point(483, 1201)).perform();
		(new TouchAction(driver)).tap(PointOption.point(699, 1198)).perform();
		(new TouchAction(driver)).tap(PointOption.point(479, 1198)).perform();
		(new TouchAction(driver)).tap(PointOption.point(699, 1208)).perform();
		(new TouchAction(driver)).tap(PointOption.point(69, 1700)).perform();
		(new TouchAction(driver)).tap(PointOption.point(46, 1198)).perform();
		(new TouchAction(driver)).tap(PointOption.point(56, 1205)).perform();
		(new TouchAction(driver)).tap(PointOption.point(1031, 1198).perform();
		(new TouchAction(driver)).tap(PointOption.point(164, 1201)).perform();
		(new TouchAction(driver)).tap(PointOption.point(112, 1369)).perform();
		(new TouchAction(driver)).tap(PointOption.point(85, 1697)).perform();
		(new TouchAction(driver)).tap(PointOption.point(538, 1372)).perform();
		(new TouchAction(driver)).tap(PointOption.point(857, 1530)).perform();
		(new TouchAction(driver)).tap(PointOption.point(118, 1372)).perform();
		(new TouchAction(driver)).tap(PointOption.point(801, 1195)).perform();
		(new TouchAction(driver)).tap(PointOption.point(968, 1366)).perform();
		(new TouchAction(driver)).tap(PointOption.point(857, 1710)).perform();
		(new TouchAction(driver)).tap(PointOption.point(433, 1533)).perform();
		(new TouchAction(driver)).tap(PointOption.point(919, 1208)).perform();
		(new TouchAction(driver)).tap(PointOption.point(863, 1530)).perform();
		(new TouchAction(driver)).tap(PointOption.point(565, 857)).perform();
		(new TouchAction(driver)).tap(PointOption.point(69, 1526)).perform();
		(new TouchAction(driver)).tap(PointOption.point(325, 1513)).perform();
		(new TouchAction(driver)).tap(PointOption.point(922, 1198)).perform();
		(new TouchAction(driver)).tap(PointOption.point(105, 1362)).perform();
		(new TouchAction(driver)).tap(PointOption.point(325, 1369)).perform();
		(new TouchAction(driver)).tap(PointOption.point(804, 1215)).perform();
		(new TouchAction(driver)).tap(PointOption.point(82, 1697)).perform();
		(new TouchAction(driver)).tap(PointOption.point(916, 1188)).perform();
		(new TouchAction(driver)).tap(PointOption.point(913, 1195)).perform();
		(new TouchAction(driver)).tap(PointOption.point(808, 1195)).perform();
		(new TouchAction(driver)).tap(PointOption.point(991, 1684)).perform();
		(new TouchAction(driver)).tap(PointOption.point(650, 1681)).perform();
		
	}
}
