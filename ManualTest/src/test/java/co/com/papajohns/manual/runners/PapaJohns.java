package co.com.papajohns.manual.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/papajohns.feature",
        glue = "co.com.papajohns.manual.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class PapaJohns {
}
