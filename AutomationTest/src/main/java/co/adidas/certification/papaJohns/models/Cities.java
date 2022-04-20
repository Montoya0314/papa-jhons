package co.adidas.certification.papaJohns.models;

import java.util.Arrays;
import java.util.List;

public class Cities {

    private String city;
    private List<String> cities = Arrays.asList("ARMENIA", "BARRANQUILLA", "BOGOTA, D.C.", "CAJICA",
            "CALI", "CHIA", "ENVIGADO", "IBAGUE", "ITAGUI",
                    "MANIZALES", "MEDELLIN", "PEREIRA", "RIONEGRO", "VILLAVICENCIO");

    public List<String> getCities() {
        return cities;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
