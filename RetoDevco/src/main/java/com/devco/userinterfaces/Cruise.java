package com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Cruise {

    public static final Target FIRS_AVAILABLE_OFFER = Target.the("first option")
            .locatedBy("(//a//span[contains(text(), 'Continue')]/ancestor::a)[1]");

    public static final Target AVAILABLE_ROOM = Target.the("available room option")
            .locatedBy("(//div/ancestor::div[@class='card-description'])[2]");


}
