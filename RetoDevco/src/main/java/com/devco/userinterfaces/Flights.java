package com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Flights {

    public static final Target FLIGHTS_UNDER = Target.the("hashtag flights under")
            .locatedBy("//h2[contains(text(), 'Flights under $200')]");

    public static final Target FIRST_OPTION_IN_OFFER = Target.the("first option in offer")
            .locatedBy("((//ul[@class='uitk-carousel-item-container'])[3]//li[@class='uitk-carousel-item'])[1]");


    public static final Target SELECT_FLIGHTS_OPTION = Target.the("select flights option")
            .locatedBy("//select[@id='listings-sort']");

}
