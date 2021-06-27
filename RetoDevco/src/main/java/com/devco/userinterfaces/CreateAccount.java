package com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateAccount {
    public static final Target FIRST_NAME = Target.the("objetc first name")
            .locatedBy("//input[@id='create-account-firstname']");

    public static final Target LAST_NAME = Target.the("objetc last name")
            .locatedBy("//input[@id='create-account-lastname']");

    public static final Target EMAIL = Target.the("objetc email")
            .locatedBy("//input[@id='create-account-emailId']");

    public static final Target PASSWORD = Target.the("objetc password")
            .locatedBy("//input[@id='create-account-password']");

    public static final Target CONFIRM_PASSWORD = Target.the("objetc confirm password ")
            .locatedBy("//input[@id='create-account-confirm-password']");

    public static final Target BUTTON_CREATE_ACCOUNT = Target.the("button create account")
            .locatedBy("//button//span[contains(text(), 'Create Account')]");

}
