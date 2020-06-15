package com.pom.base;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/sahi_test.feature",
        snippets = SnippetType.CAMELCASE
)
public class RunnerFeatures {

}
