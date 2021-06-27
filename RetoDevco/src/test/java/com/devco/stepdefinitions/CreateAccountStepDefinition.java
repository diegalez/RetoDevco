package com.devco.stepdefinitions;

import static com.devco.utils.ErrorMessage.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.devco.userinterfaces.CreateAccount.BUTTON_CREATE_ACCOUNT;
import com.devco.exceptions.ExceptionError;
import com.devco.models.User;
import com.devco.questions.TheMessage;
import com.devco.tasks.CreateAccount;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;

public class CreateAccountStepDefinition {

    @Cuando("^crea una cuenta con los siguientes datos$")
    public void creaUnaCuentaConLosSiguientesDatos(List<User> dataUser) {
        theActorInTheSpotlight().attemptsTo(CreateAccount.inTheCatalogInThe(dataUser.get(0)));

    }

    @Entonces("^deberia en la ventana user ver el mensaje (.*)$")
    public void deberiaEnLaVentanaUserVerElMensajeCrearUnaCuenta(String messageExpected) {
        theActorInTheSpotlight().should(seeThat(TheMessage.inTheFront(BUTTON_CREATE_ACCOUNT), equalTo(messageExpected))
                .orComplainWith(ExceptionError.class, MESSAGE.getMessage()));
    }
}
