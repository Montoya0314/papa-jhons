package co.adidas.certification.papaJohns.tasks;

import co.adidas.certification.papaJohns.userinterfaces.HomePage;
import co.adidas.certification.papaJohns.userinterfaces.PopUpWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CheckCitiesList implements Task {

    @Override
    public <T extends Actor> void performAs(T michael) {
        michael.attemptsTo(Click.on(HomePage.BTN_MENU_LOCATIONS));
    }

    public static CheckCitiesList followingTheInstructions(){
        return Tasks.instrumented(CheckCitiesList.class);
    }

}
