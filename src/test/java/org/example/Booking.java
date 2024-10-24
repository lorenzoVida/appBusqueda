package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;

public class Booking {
    public AndroidDriver driver;


        public AndroidDriver setUp() throws MalformedURLException {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Android");
            cap.setCapability("deviceName", "Android");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
           cap.setCapability("appPackage", "com.booking");
            cap.setCapability("appActivity", "com.booking.startup.HomeActivity");
        //    cap.setCapability("noreset", true);
           driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
            //driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
          //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            return driver;
        }


    public void ingresar() {
    //    driver.findElementById("00000000-0000-0080-ffff-ffff0000008d").click();
    //    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");

        //driver.findElement(AppiumBy.accessibilityId("Enter your destination"));
        // /   driver.findElementById("00000000-0000-0080-ffff-ffff0000008d").click();
       //    driver.findElementById("Enter your destination").click();
       // driver.findElementByXPath("//android.widget.TextView[@text=\"Stays\"]").click();
        // index =1
        ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView
        // resource-id com.booking:id/facet_entry_point_item_label
        //elementId
        //accessibility id Enter your destination
        //xpath //android.widget.Button[@content-desc="Enter your destination"]
       // driver.findElementByXPath("//android.widget.Button[@content-desc=\"Enter your destination\"]").click();
       // driver.findElementByXPath("//android.widget.Button[@content-desc=\"Enter your destination\"]").sendKeys("Cusco");
       // driver.findElementByXPath("//android.widget.Button[@text=\"Enter your destination\"]").click();
       //∫ driver.findElementById("00000000-0000-0080-0000-000b00000089").click();
        //    String nameAlert= driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
    //    System.out.println(nameAlert);
    //    assertEquals("Please enter your name", nameAlert);
        
    }



}
