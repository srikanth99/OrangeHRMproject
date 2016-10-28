package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by theop on 25/10/2016.
 */
public class Utilities extends BrowserFactory {

    public static void hoverOver(WebDriver driver, WebElement hover) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();

    }
}
