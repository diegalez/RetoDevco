package com.devco.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Waits implements Interaction {

    private int sec;

    public Waits(int sec) {
        this.sec = sec;
    }

    public static Interaction seconds(int sec) {
        return Tasks.instrumented(Waits.class, sec);
    }

    @Override
    @Step("{0} wait #second before of execute the next action")
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor((sec * 1000));
    }
}
