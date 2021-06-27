package com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeElemets {

    public static final Target SEARCH = Target.the("button search")
            .locatedBy("//button[contains(text(), 'Search')]");

    public static final Target GOING_TO = Target.the("button going to")
            .locatedBy("//div[@id='location-field-destination-menu']");

    public static final Target WHERE_ARE_YOU_GOING_TO = Target.the("campo search")
            .locatedBy("//input[@id='location-field-destination']");

    public static final Target INDEX = Target.the("index")
            .locatedBy("//li[@data-index='0']");

    public static final Target WATCH_ROAD_TRIPS = Target.the("image watch road trips")
            .locatedBy("((//div[@role='region'])[13]//div[@role='region'])[2]");

    public static final Target SIGN_IN = Target.the("button sign in")
            .locatedBy("//button[contains(text(), 'Sign in')]");

    public static final Target CREATE_ACCOUNT = Target.the("button create account")
            .locatedBy("//a[contains(text(), 'Create a free account')]");

    public static final Target CRUISES = Target.the("button cruises")
            .locatedBy("//span[contains(text(), 'Cruises')]");

    public static final Target SELECT_DESTINATION = Target.the("select destination")
            .locatedBy("//select[@id='cruise-destination']");

    public static final Target SELECT_DESTINATION_OPTION = Target.the("select destination option")
            .locatedBy("(//option[contains(text(), '{0}')])[1]");

    public static final Target BUTTON_MORE_TRAVEL = Target.the("button more trips")
            .locatedBy("//div[contains(text(), 'More travel')]/ancestor::button");

    public static final Target TRAVEL_DEALS = Target.the("travel deals option")
            .locatedBy("((//a[@role='menuitem']/parent::div)[2]//a)[9]//div");
}
