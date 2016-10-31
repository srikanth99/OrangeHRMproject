package orangeHRM;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.BrowserFactory;

/**
 * Created by theop on 13/10/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/Report.HTML", "json:target/Report.Json"}, tags = {"@test"}, features = {"src\\test\\resources\\Feature"})

public class RunnerClass {

    @BeforeClass
    public static void openBrowser() {
        BrowserFactory.startBrowser();
    }

    @AfterClass
    public static void closeBrowser() {
        BrowserFactory.stopBrowser();
    }
}

