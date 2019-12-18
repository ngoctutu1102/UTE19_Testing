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

public class Add_Contact {
	
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
	public void RunTest() throws MalformedURLException, InterruptedException {
		AddContact();
		DeleteContact();
	}

	//@Test (priority = 1)
	//Catch Element and execute code
	public void AddContact() throws MalformedURLException, InterruptedException {
		//Touch into icon Add Contact
		(new TouchAction(driver)).press(PointOption.point(1005, 1686)).moveTo(PointOption.point(947, 1666)).release().perform();
		Thread.sleep(500);
		//Click accept Alert
		MobileElement el0 = (MobileElement) driver.findElementById("com.android.contacts:id/right_button");
		el0.click();
		Thread.sleep(500);
		//SendKey on [Name]
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
		el1.sendKeys("Auto Test 5");
		Thread.sleep(500);
		//SendKey on [Phone]
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
		el2.sendKeys("12345678991");
		Thread.sleep(500);
		//SendKey on [Phone2]
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
		el3.sendKeys("299876543210");
		Thread.sleep(500);
		//SendKey on [Phone]
		MobileElement el4 = (MobileElement) driver.findElementByXPath("(//android.widget.Spinner[@content-desc=\"Phone\"])[2]");
		el4.click();
		Thread.sleep(500);
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
		el5.click();
		Thread.sleep(500);
		//Click accept and Save 
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Save");
		el6.click();
		Thread.sleep(500);
		//Screen Shot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
	}

	//@Test (priority = 2)
	public void DeleteContact() throws MalformedURLException, InterruptedException {
		//Click into a contact
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[4]");
		el1.click();
		Thread.sleep(500);
		//Click [More Option];
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("More options");
		el2.click();
		Thread.sleep(500);
		//Click [Delete]
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
		el3.click();
		Thread.sleep(500);
		//Click [OK]
		MobileElement el4 = (MobileElement) driver.findElementById("android:id/button1");
		el4.click();
		Thread.sleep(500);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
	}





}
