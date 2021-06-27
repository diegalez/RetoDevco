package com.devco.stepdefinitions;

import com.devco.exceptions.ExceptionError;
import com.devco.questions.TheMessage;
import com.devco.tasks.WatchRoadTrips;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.Matchers.containsString;
import static com.devco.userinterfaces.Inspire.HEADER_POSTS_INSPIRE;
import static com.devco.utils.ErrorMessage.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class WatchRoadTripsStepDefinition {

    @Before
    public static void configurarActor() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }

    @Cuando("^busca si hay viajes por carretera disponibles$")
    public void buscaSiHayViajesPorCarreteraDisponibles() {
        theActorInTheSpotlight().attemptsTo(WatchRoadTrips.inTheCatalogInThe());
    }

    @Entonces("^deberia en la ventana inspire ver el mensaje (.*) bucket-list road trips$")
    public void deberiaEnLaVentanaInspireVerElMensajeBucketListRoadTrips(String messageExpected) {
        theActorInTheSpotlight().should(seeThat(TheMessage.inTheFront(HEADER_POSTS_INSPIRE), containsString(messageExpected))
                .orComplainWith(ExceptionError.class, MESSAGE.getMessage()));
    }

}
