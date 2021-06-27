package com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.devco.userinterfaces.HomeElemets.SEARCH;
import static com.devco.userinterfaces.HomeElemets.GOING_TO;
import static com.devco.userinterfaces.HomeElemets.WHERE_ARE_YOU_GOING_TO;
import static com.devco.userinterfaces.HomeElemets.INDEX;
import static com.devco.userinterfaces.Destinations.SEARCH_DESTINATIONS;
import static com.devco.userinterfaces.Destinations.FIVE_STARS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class SearchRoom implements Task {

    private final String city;

    public SearchRoom(String city) {
        this.city = city;
    }
    @Step("{0} search in the catalog")
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo( WaitUntil.the(SEARCH, isVisible()),
                    Click.on(GOING_TO),
                    Enter.theValue(city).into(WHERE_ARE_YOU_GOING_TO),
                    Click.on(INDEX), WaitUntil.the(SEARCH, isVisible()),
                    Click.on(SEARCH), WaitUntil.the(SEARCH_DESTINATIONS, isVisible()),
                    WaitUntil.the(FIVE_STARS, isVisible()),
                    Click.on(FIVE_STARS));
    }

    public static SearchRoom inTheCatalogInThe(String city) {
        return Tasks.instrumented(SearchRoom.class, city);
    }
}
