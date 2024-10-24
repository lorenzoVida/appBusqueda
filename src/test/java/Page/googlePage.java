package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class googlePage {

    AndroidDriver driver;
    public googlePage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath="//android.widget.Button[@text=\"Continue with Google\"]")
    private WebElement btnContinuarConGoogle;

    public void clickContinuarConGoogle(){
        btnContinuarConGoogle.click();
    }

}
