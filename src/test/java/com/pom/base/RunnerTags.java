package com.pom.base;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
@CucumberOptions(
        features = "src/test/resources/features/operacionesBasicas.feature",
        tags = "@TestCase1",
        snippets = SnippetType.CAMELCASE
)
//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@CasoAlterno")
public class RunnerTags {

}
