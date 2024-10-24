package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class baseTest {

    public AndroidDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        //AppiumServiceBuilder service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
        //        .withIPAddress("127.0.0.1").usingPort(4723);
        // service.start();
        UiAutomator2Options cap = new UiAutomator2Options();
        cap.setDeviceName("Android");
        cap.setPlatformName("Android");
        cap.setAutomationName("uiautomator2");
        cap.setAppPackage("com.booking");
        cap.setAppActivity("com.booking.appindex.presentation.activity.SearchActivity");
       // cap.setAppActivity("com.booking.startup.HomeActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
    }

    public void scrollToEnd(){
        boolean canScrollMore;
        do{
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
                    ImmutableMap.builder()
                            .put("left", 100)
                            .put("top", 100)
                            .put("width", 200)
                            .put("height", 200)
                            .put("direction", "down")
                            .put("percent", 0.75)
                            .build()
            );
        }while (canScrollMore);
    }

  //  public void longPressAction(WebElement e){
  //      ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)e).getId(),
  //              "duration",2000));
  //  }
}
