package com.alkomprar.serenity.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AgregarCarrito.feature",
        glue = "com.alkomprar.serenity.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CarritoRunner {

}
