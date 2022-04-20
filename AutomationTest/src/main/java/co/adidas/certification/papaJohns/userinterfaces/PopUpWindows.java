package co.adidas.certification.papaJohns.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopUpWindows {

    public static final Target BTN_CLOSE = Target.the("CLOSE").
            located(By.xpath("//*[@id=\"myModalLogin\"]/div/div/div[1]/button/i"));


}
