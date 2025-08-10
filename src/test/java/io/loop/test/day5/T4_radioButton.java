package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class T4_radioButton {
    public static void main(String[] args) {
            /*
        https://loopcamp.vercel.app/radio-buttons.html
        wait implicitly 10 seconds
        is selected
        is enabled
         */

        WebDriver driver =  WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        driver.get(LoopCampConstants.RADIOBUTTON_URL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
}
