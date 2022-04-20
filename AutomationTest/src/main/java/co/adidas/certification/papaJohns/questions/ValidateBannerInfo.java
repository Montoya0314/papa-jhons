package co.adidas.certification.papaJohns.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.adidas.certification.papaJohns.userinterfaces.LocationsPage.TXT_FIND_YOUR_CLOSER_LOCATION;

public class ValidateBannerInfo implements Question {

    public static ValidateBannerInfo locationBanner(){
        return new ValidateBannerInfo();
    }

    @Override
    public Object answeredBy(Actor actor) {
        System.out.println(Text.of(TXT_FIND_YOUR_CLOSER_LOCATION).viewedBy(actor).asString());
        return Text.of(TXT_FIND_YOUR_CLOSER_LOCATION).viewedBy(actor).asString();
    }
}
