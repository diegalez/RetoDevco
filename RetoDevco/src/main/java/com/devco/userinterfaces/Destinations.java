package com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Destinations {

    public static final Target SEARCH_DESTINATIONS = Target.the("button search")
            .locatedBy("//button[contains(text(), 'Search')]");

    public static final Target FIVE_STARS = Target.the("button five stars")
            .locatedBy("//span[contains(text(), '5★')]");

    public static final Target HASHTAG_FIVE_STARS = Target.the("hashtag five stars")
            .locatedBy("//span[contains(text(), '5 star')]");

    public static final Target HOTEL = Target.the("Hotel")
            .locatedBy("(//h3[contains(text(), 'Charleston Santa Teresa Cartagena')])[2]");
}
