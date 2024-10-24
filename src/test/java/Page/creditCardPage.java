package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class creditCardPage {
    AndroidDriver driver;
    public creditCardPage(AndroidDriver driver){

        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

    @AndroidFindBy(accessibility="xx")
    private WebElement completarDatosPago;
    public void completarPago(){
        completarDatosPago.click();
    }
}
