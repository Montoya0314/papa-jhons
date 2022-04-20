package co.adidas.certification.papaJohns.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationsPage {

    public static final Target TXT_FIND_YOUR_CLOSER_LOCATION = Target.the("BANNER").
            located(By.id("ctl00_ContentPlaceHolder1_LblTitulo"));

    public static final Target SLC_CITY = Target.the("SELECTOR").
            located(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlCiudades\"]"));

    public static final Target LBL_PHONE = Target.the("PHONE").
            located(By.xpath("//*[@id=\"ctl00_divTamanioConten\"]/div/div/div[2]/div[1]/div[4]"));

    public static final Target LBL_STORE = Target.the("STORE").
            located(By.xpath("//*[@id=\"ctl00_divTamanioConten\"]/div/div/div[2]/div[2]/div/div[3]/button/div/div/h3"));



}
