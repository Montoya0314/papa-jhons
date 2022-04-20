package co.adidas.certification.papaJohns.questions;

import co.adidas.certification.papaJohns.userinterfaces.LocationsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.text.Normalizer;
import java.util.List;

public class ValidateCitiesList implements Question{

    public static ValidateCitiesList locationCities(){
        return new ValidateCitiesList();
    }

    public  List<String> cleanString(List<String> cities) {
        for (int i = 0; i < cities.size(); i++) {
            cities.set(i, Normalizer.normalize(cities.get(i), Normalizer.Form.NFD));
            cities.set(i, cities.get(i).replaceAll("[\\p{InCombiningDiacriticalMarks}]", ""));
        }
        return cities;
    }


    @Override
    public Object answeredBy(Actor actor) {
        return cleanString(LocationsPage.SLC_CITY.resolveFor(actor).getSelectOptions());
    }


}
