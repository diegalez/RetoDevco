package com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class GetValues implements Interaction {

    private Target target;

    public GetValues(Target target) {
        this.target=target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String informationObject = Text.of(target).viewedBy(actor).value();
        actor.remember("OBJECT", informationObject);
    }

    public static GetValues ofTheFront(Target target) {
        return new GetValues(target);
    }


}