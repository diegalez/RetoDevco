package com.devco.tasks;

import com.devco.interactions.GetValues;
import com.devco.questions.Validate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static com.devco.userinterfaces.HomeElemets.TRAVEL_DEALS;
import static com.devco.userinterfaces.HomeElemets.BUTTON_MORE_TRAVEL;
import static com.devco.userinterfaces.Flights.FLIGHTS_UNDER;
import static com.devco.userinterfaces.Flights.FIRST_OPTION_IN_OFFER;
import static com.devco.userinterfaces.Flights.SELECT_FLIGHTS_OPTION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
public class SeeFlightsOnOffer implements Task {

    private String price;

    public SeeFlightsOnOffer(String price) {
        this.price = price;
    }

    @Step("{0} see fligths on offer")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( WaitUntil.the(BUTTON_MORE_TRAVEL, isVisible()), Click.on(BUTTON_MORE_TRAVEL),
                WaitUntil.the(TRAVEL_DEALS, isVisible()), Click.on(TRAVEL_DEALS),
                WaitUntil.the(FLIGHTS_UNDER, isVisible()),
                GetValues.ofTheFront(FLIGHTS_UNDER));
        String flights_under = actor.recall("OBJECT");
        actor.should(seeThat(Validate.ifObject(flights_under.substring(15,18),price), is(equalTo(true))));
        actor.attemptsTo(Click.on(FIRST_OPTION_IN_OFFER),Waits.seconds(6),
        WaitUntil.the(SELECT_FLIGHTS_OPTION, isVisible()), GetValues.ofTheFront(SELECT_FLIGHTS_OPTION)
                );
    }

    public static SeeFlightsOnOffer inTheCatalogInThe(String price) {
        return Tasks.instrumented(SeeFlightsOnOffer.class, price);
    }
}
