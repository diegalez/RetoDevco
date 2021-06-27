package com.devco.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.devco.drivers.DriverChrome;
import com.devco.exceptions.ExceptionError;
import static com.devco.utils.ErrorMessage.MESSAGE;
import com.devco.questions.TheMessage;
import com.devco.tasks.SearchRoom;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static com.devco.utils.Constants.PAGE_URL;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.Matchers.equalTo;
import static com.devco.userinterfaces.Destinations.HOTEL;
public class SearchRoomStepDefinition {

    @Before
    public static void configurarActor() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }
    @Dado("^que el usuario ingresa en la plataforma$")
    public void queElUsuarioIngresaEnLaPlataforma() {
        theActorCalled("usuario").whoCan(BrowsingTheWeb.with(DriverChrome.web().inTheWebPage(PAGE_URL)));
    }

    @Cuando("^busca hoteles de cinco estrellas en la ciudad (.*)$")
    public void buscaHotelesDeCincoEstrellasEnLaCiudadCartagena(String city) {
        theActorInTheSpotlight().attemptsTo(SearchRoom.inTheCatalogInThe(city));

    }

    @Entonces("^deberia ver el mensaje (.*)$")
    public void deberiaVerElMensajeCharlestonSantaTeresaCartagena(String messageExpected) {
        theActorInTheSpotlight().should(seeThat(TheMessage.inTheFront(HOTEL), equalTo(messageExpected))
                .orComplainWith(ExceptionError.class, MESSAGE.getMessage()));

    }
}
