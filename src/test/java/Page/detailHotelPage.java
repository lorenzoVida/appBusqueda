package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class detailHotelPage {
    AndroidDriver driver;
    public detailHotelPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup")
    private WebElement btnSeleccionarEstadia;

    @AndroidFindBy(id="com.booking:id/button_positive")
    private WebElement btnOKYourStay;

    @AndroidFindBy(id="com.booking:id/rooms_item_select_text_view")
    private WebElement btnSelectRoom;

    public void seleccionarEstadia(){
        btnSeleccionarEstadia.click();
    }

    public void seleccionarHabitaciones(){
        btnOKYourStay.click();
    }

    public void confirmarEstadia(){
        btnOKYourStay.click();
    }
}
