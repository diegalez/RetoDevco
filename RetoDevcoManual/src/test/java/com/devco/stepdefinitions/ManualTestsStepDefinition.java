package com.devco.stepdefinitions;
import static com.devco.utils.Test.validate;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
public class ManualTestsStepDefinition {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void openTheCalculator(String step) throws Exception {
        validate(step, scenario.getName());
    }
}
