package co.adidas.certification.papaJohns.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.adidas.certification.papaJohns.userinterfaces.LocationsPage.LBL_PHONE;

public class ValidateThePhoneNumber implements Question {


    public static ValidateThePhoneNumber phoneValidation(){
        return new ValidateThePhoneNumber();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LBL_PHONE).viewedBy(actor).asString();
    }

}
