package com.devco.tasks;

import com.devco.interactions.TabChange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static com.devco.userinterfaces.Cruise.AVAILABLE_ROOM;
import static com.devco.userinterfaces.Cruise.FIRS_AVAILABLE_OFFER;
import static com.devco.userinterfaces.HomeElemets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeeCruisepackages implements Task {

    private final String city;

    public SeeCruisepackages(String city) {
        this.city = city;
    }
    @Step("{0} search cruise in the catalog")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( WaitUntil.the(CRUISES, isVisible()), Click.on(CRUISES),
                WaitUntil.the(SELECT_DESTINATION, isVisible()), Click.on(SELECT_DESTINATION),
                Click.on(SELECT_DESTINATION_OPTION.of(city)),
                WaitUntil.the(SEARCH, isVisible()), Click.on(SEARCH),
                WaitUntil.the(FIRS_AVAILABLE_OFFER, isVisible()), Click.on(FIRS_AVAILABLE_OFFER),
                TabChange.inTheBrowser(),
                WaitUntil.the(AVAILABLE_ROOM, isVisible())
        );
        String informationObject = Text.of(AVAILABLE_ROOM).viewedBy(actor).value().substring(0,7);
        actor.remember("INFORMATION_OBJECT", informationObject);
    }

    public static SeeCruisepackages In(String city) {
        return Tasks.instrumented(SeeCruisepackages.class, city);
    }
}
