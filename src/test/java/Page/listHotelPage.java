package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class listHotelPage {
    AndroidDriver driver;
    public listHotelPage(AndroidDriver driver){

        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Andenes\"]")
    private WebElement textoNombreHotel;
    public void seleccionarNombreHotel(){
        textoNombreHotel.click();
    }

}
