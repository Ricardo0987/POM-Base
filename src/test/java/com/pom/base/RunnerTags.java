package com.pom.base;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/sahi_test.feature",
        tags = "@TestCase3",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {

}
