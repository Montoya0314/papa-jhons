package co.adidas.certification.papaJohns.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\feature\\check_locations.feature",
        glue = "co.adidas.certification.papaJohns.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@checkingCities" )
public class CheckLocations {
}
