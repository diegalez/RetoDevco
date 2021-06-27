package com.devco.tasks;

import com.devco.interactions.TabChange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.devco.userinterfaces.HomeElemets.WATCH_ROAD_TRIPS;
public class WatchRoadTrips implements Task {

    @Step("{0} Watch road trips")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( WaitUntil.the(WATCH_ROAD_TRIPS, isVisible()),
                Click.on(WATCH_ROAD_TRIPS),
                TabChange.inTheBrowser()

        );
    }

    public static WatchRoadTrips inTheCatalogInThe() {
        return Tasks.instrumented(WatchRoadTrips.class);
    }
}