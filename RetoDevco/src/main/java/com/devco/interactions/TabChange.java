package com.devco.interactions;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

public class TabChange implements Interaction {
    private static final Logger LOGGER = LoggerFactory.getLogger(TabChange.class);
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();
        driver.manage().window().maximize();

        driver.navigate (). refresh ();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
        LOGGER.info(driver.getTitle());
        if (driver.getTitle().equalsIgnoreCase("Aplications online")) {
            LOGGER.info("TabChange");
            driver.switchTo().window(tabs.get(0));
            driver.manage().window().maximize();
        }
        LOGGER.info(driver.getTitle());
    }

    public static TabChange inTheBrowser() {

        return instrumented(TabChange.class);
    }
}