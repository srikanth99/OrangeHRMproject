package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;

/**
 * Created by theop on 13/10/2016.
 */

public class BasePage extends BrowserFactory {

    static WebDriver driver = BrowserFactory.getDriver();
    BasePage() {
        PageFactory.initElements(driver, this);
    }

}
