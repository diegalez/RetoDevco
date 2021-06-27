package com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validate implements Question {
    private String selection;
    private String messageExpected;

    public Validate(String selection) {
        this.selection = selection;
    }

    public static Question<Boolean> ifThereIsRoomAvailable(String availableRoom, String messageExpected) {
        String selection = "1";
        if (availableRoom.equals(messageExpected)) {
            return new Validate(selection);
        } else {
            selection = "FALSO";
            return new Validate(selection);
        }
    }

    public static Question<Boolean> ifObject(String flights_under, String price) {
        String selection = "1";
        if (flights_under.equals(price)) {
            return new Validate(selection);
        } else {
            selection = "FALSO";
            return new Validate(selection);
        }
    }

    public static Question<Boolean> ifThereIsAnOffer(String flights_offer, String messageExpected) {
        String selection = "1";
        if (flights_offer.contains(messageExpected)) {
            return new Validate(selection);
        } else {
            selection = "FALSO";
            return new Validate(selection);
        }
    }


    @Override
    public Object answeredBy(Actor actor) {
        switch (selection) {
            case "1":
                return true;
            case "2":
                return messageExpected;
            default:
                return false;
        }
    }

}
