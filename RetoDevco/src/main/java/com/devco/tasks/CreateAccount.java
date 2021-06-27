package com.devco.tasks;

import com.devco.interactions.EnterDataUser;
import com.devco.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static com.devco.userinterfaces.HomeElemets.CREATE_ACCOUNT;
import static com.devco.userinterfaces.HomeElemets.SIGN_IN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateAccount implements Task {

    private User user;

    public CreateAccount(User user) {
        this.user = user;
    }

    @Step("{0} create account")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( WaitUntil.the(SIGN_IN, isVisible()), Click.on(SIGN_IN),
                WaitUntil.the(CREATE_ACCOUNT, isVisible()), Click.on(CREATE_ACCOUNT),
                EnterDataUser.inTheCreationForm(user)
        );
    }

    public static CreateAccount inTheCatalogInThe(User user) {
        return Tasks.instrumented(CreateAccount.class, user);
    }
}