package com.devco.stepdefinitions;

import static com.devco.utils.ErrorMessage.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.devco.exceptions.ExceptionError;
import com.devco.questions.Validate;
import com.devco.tasks.SeeFlightsOnOffer;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.equalTo;
public class SeeFlightsOnOfferStepDefinition {


    @Cuando("^busca ofertas de vuelos por debajo del precio (.*)$")
    public void buscaOfertasDeVuelosPorDebajoDelPrecio(String price) {
        theActorInTheSpotlight().attemptsTo(SeeFlightsOnOffer.inTheCatalogInThe(price));
    }


    @Entonces("^deberia en la ventana ofertas ver el mensaje (.*) con ofertas disponibles$")
    public void deberiaEnLaVentanaOfertasVerElMensajePrecioMásBajoConOfertasDisponibles(String messageExpected) {
        String flights_offer = theActorInTheSpotlight().recall("OBJECT");
        theActorInTheSpotlight().should(seeThat(Validate.ifThereIsAnOffer(flights_offer,messageExpected), equalTo(true))
                .orComplainWith(ExceptionError.class, MESSAGE.getMessage()));
    }

}
