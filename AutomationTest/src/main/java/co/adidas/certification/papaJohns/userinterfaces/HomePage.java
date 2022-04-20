package co.adidas.certification.papaJohns.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BTN_MENU = Target.the("MENU").
            located(By.xpath("//*[@id=\"ctl00_divMenuPpal\"]/a[1]"));

    public static final Target BTN_MENU_ORDERS = Target.the("ORDERS").
            located(By.xpath("//*[@id=\"ctl00_divMenuPpal\"]/a[2]"));

    public static final Target BTN_MENU_LOCATIONS = Target.the("LOCATIONS").
            located(By.xpath("//*[@id=\"ctl00_divMenuPpal\"]/a[3]"));

    public static final Target BTN_MENU_ACCESS = Target.the("ACCESS").
            located(By.xpath("//*[@id=\"ctl00_divMenuPpal\"]/button[2]"));









}
