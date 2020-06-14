package com.pom.base;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/prueba_fase_1.feature",
        snippets = SnippetType.CAMELCASE
)
public class RunnerFeatures {

}
