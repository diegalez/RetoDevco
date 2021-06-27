package com.devco.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import com.devco.interactions.Waits;
public class TheMessage implements Question<String> {

    private Target target;

    public TheMessage(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Waits.seconds(3));
        return Text.of(target).viewedBy(actor).value();
    }

    public static TheMessage inTheFront(Target target) {
        return new TheMessage(target);
    }

}