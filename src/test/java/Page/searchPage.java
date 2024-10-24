package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class searchPage {
    AndroidDriver driver;
    public searchPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(accessibility="Enter your destination")
    private WebElement destino;

    @AndroidFindBy(id="com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    private WebElement destinoAllScreen;
    @AndroidFindBy(xpath="//android.view.text[@text=\"Cusco\"]")
    private WebElement lblCuscoCityConfirmation;

    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"06 October 2023\"]")
    private WebElement calendarFechaInicial;

    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"07 October 2023\"]")
    private WebElement calendarFechaFinal;

    @AndroidFindBy(xpath="//android.view.View[@text=\"Select dates\"]")
    private WebElement btnSeleccionarFechas;

    public void clickDestino(){
        destino.click();
    }

    public void setDestino(String lugar){

        destinoAllScreen.sendKeys(lugar);
    }

    public void seleccionarDestinoIdeal(){
        lblCuscoCityConfirmation.click();
    }

    public void seleccionarFechasCalendario(){
        calendarFechaInicial.click();
        calendarFechaFinal.click();
    }

    public void confirmarFechas(){
        btnSeleccionarFechas.click();
    }
}
