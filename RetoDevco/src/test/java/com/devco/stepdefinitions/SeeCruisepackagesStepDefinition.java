package com.devco.stepdefinitions;

import static com.devco.utils.ErrorMessage.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.devco.exceptions.ExceptionError;
import com.devco.questions.Validate;
import com.devco.tasks.SeeCruisepackages;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.equalTo;

public class SeeCruisepackagesStepDefinition {

    @Cuando("^busca si hay cruceros disponibles a las Bahamas (.*)$")
    public void buscaSiHayCrucerosDisponiblesALasBahamasBahamas(String city) {
        theActorInTheSpotlight().attemptsTo(SeeCruisepackages.In(city));
    }

    @Entonces("^deberia en la ventana cruise ver el mensaje (.*) que indique que hay habitaciones disponibles$")
    public void deberiaEnLaVentanaCruiseVerElMensajeSuiteQueIndiqueQueHayHabitacionesDisponibles(String messageExpected) {
        String availableRoom = theActorInTheSpotlight().recall("INFORMATION_OBJECT");
        theActorInTheSpotlight().should(seeThat(Validate.ifThereIsRoomAvailable(availableRoom,messageExpected), equalTo(true))
                .orComplainWith(ExceptionError.class, MESSAGE.getMessage()));
    }

}
