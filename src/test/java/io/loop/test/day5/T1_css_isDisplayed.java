package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_css_isDisplayed {

    /*
    https://the-internet.herokuapp.com/forgot_password
     */

    public static void main(String[] args) {

        // setup driver and navigate

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        driver.navigate().to(GeneralConstants.HEROKUAPP_URL);

        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div>h2"));

        System.out.println(forgotPasswordHeading.getText());

        System.out.println(forgotPasswordHeading.isDisplayed());


        if(forgotPasswordHeading.isDisplayed()) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
    }
}
