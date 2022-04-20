package co.adidas.certification.papaJohns.tasks;

import co.adidas.certification.papaJohns.userinterfaces.HomePage;
import co.adidas.certification.papaJohns.userinterfaces.PopUpWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTheLocationLink implements Task {

    @Override
    public <T extends Actor> void performAs(T michael) {
        michael.attemptsTo(Click.on(HomePage.BTN_MENU_ORDERS),
                Click.on(PopUpWindows.BTN_CLOSE),
                Click.on(HomePage.BTN_MENU),
                Click.on(HomePage.BTN_MENU_ACCESS),
                Click.on(PopUpWindows.BTN_CLOSE),
                Click.on(HomePage.BTN_MENU_LOCATIONS));
    }

    public static SelectTheLocationLink followingTheInstructions(){
        return Tasks.instrumented(SelectTheLocationLink.class);
    }


}
