package co.adidas.certification.papaJohns.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateLocation implements Question {

    public static ValidateLocation shippingAddressForm(){
        return new ValidateLocation();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("Location").toString();
    }
}
