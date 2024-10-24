package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class formularioPage {
    AndroidDriver driver;
    public formularioPage(AndroidDriver driver){

        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

}
