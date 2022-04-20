package co.adidas.certification.papaJohns.tasks;

import co.adidas.certification.papaJohns.models.Cities;
import co.adidas.certification.papaJohns.userinterfaces.HomePage;
import co.adidas.certification.papaJohns.userinterfaces.LocationsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class SelectACity implements Task {

    private String city;

    public SelectACity(List<Cities> data){
        this.city = data.get(0).getCity();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_MENU_LOCATIONS),
                Click.on(LocationsPage.SLC_CITY),
                SelectFromOptions.byVisibleText(city).from(LocationsPage.SLC_CITY));
    }


    public static SelectACity usingTheData(List<Cities> data){
        return Tasks.instrumented(SelectACity.class,data);
    }

}
