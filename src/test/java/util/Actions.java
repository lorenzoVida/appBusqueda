package util;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Actions {
    AndroidDriver driver;
    public Actions(AndroidDriver driver){
        this.driver=driver;
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
