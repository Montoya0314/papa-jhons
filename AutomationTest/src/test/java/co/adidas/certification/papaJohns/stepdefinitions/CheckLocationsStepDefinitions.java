package co.adidas.certification.papaJohns.stepdefinitions;

import co.adidas.certification.papaJohns.exceptions.ErrorException;
import co.adidas.certification.papaJohns.models.Cities;
import co.adidas.certification.papaJohns.questions.*;
import co.adidas.certification.papaJohns.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CheckLocationsStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Michael");
    }

    @Given("^The user is on the page$")
    public void theUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.papajohns.com.co/"));
    }

    @When("^The user select a city$")
    public void theUserSelectACity(List <Cities> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectACity.usingTheData(data));
    }

    @Then("^The user validates the phone number (.*)$")
    public void theUserValidatesThePhoneNumber(String args) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateThePhoneNumber.phoneValidation(),
                Matchers.equalTo(args)).orComplainWith(ErrorException.class, "Phone doesn't match"));
    }

    @When("^The user select location link$")
    public void theUserSelectLocationLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckCitiesList.followingTheInstructions());
    }

    @When("^The user click on the locations link$")
    public void theUserClickOnTheLocationsLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTheLocationLink.followingTheInstructions());
    }

    @Then("^The user validates the banner text (.*)$")
    public void theUserValidatesTheBannerText(String args) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBannerInfo.locationBanner(), Matchers.equalTo(args)).orComplainWith(ErrorException.class, "Banner message doesn't match"));
    }

    @Then("^The user validates if the store exists (.*)$")
    public void theUserValidatesIfTheStoreExists(String args) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateStore.location(), Matchers.equalTo(args)).orComplainWith(ErrorException.class, "Store doesn't exists"));
    }

    @Then("^The user validates the list of cities$")
    public void theUserValidatesTheListOfCities() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCitiesList.locationCities(), Matchers.equalTo(new Cities().getCities())).orComplainWith(ErrorException.class, "List doesn't match"));
    }


}
