package org.example;

import Page.detailHotelPage;
import Page.listHotelPage;
import Page.searchPage;
import org.testng.annotations.Test;
import java.net.MalformedURLException;


public class desafio extends baseTest {

    @Test
    public void shopTrip() throws MalformedURLException, InterruptedException {
        searchPage search = new searchPage(driver);

        search.clickDestino();
        search.setDestino("Cusco");
        search.seleccionarDestinoIdeal();
        search.seleccionarFechasCalendario();
        search.confirmarFechas();
        listHotelPage listHotel = new listHotelPage(driver);
        listHotel.seleccionarNombreHotel();
        detailHotelPage detailHotel = new detailHotelPage(driver);
        detailHotel.seleccionarEstadia();
        detailHotel.seleccionarHabitaciones();
        detailHotel.confirmarEstadia();
        scrollToEnd();

    }

}
