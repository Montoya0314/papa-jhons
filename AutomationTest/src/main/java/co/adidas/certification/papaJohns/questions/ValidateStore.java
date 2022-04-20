package co.adidas.certification.papaJohns.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.adidas.certification.papaJohns.userinterfaces.LocationsPage.LBL_STORE;

public class ValidateStore implements Question {

    public static ValidateStore location(){
        return new ValidateStore();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LBL_STORE).viewedBy(actor).asString();
    }
}
