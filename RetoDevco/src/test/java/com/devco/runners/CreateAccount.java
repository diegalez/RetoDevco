package com.devco.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.devco.stepdefinitions",
        features = "src/test/resources/features/create_account.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)
public class CreateAccount {
}
