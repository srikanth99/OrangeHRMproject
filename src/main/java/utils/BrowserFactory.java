package utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by theop on 14/10/2016.
 */

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver getDriver() {

        if(driver==null)
        {
            BrowserFactory.startBrowser();
        }
        return driver;
    }

    public static void startBrowser() {
        if (AutomationConstants.REMOTE_BROWSER.equalsIgnoreCase("true")) {
            try {
                System.out.println("grid started in BrowserStack...");

                DesiredCapabilities capabilities = new DesiredCapabilities();
                if (System.getProperty("Browser").equalsIgnoreCase("firefox")) {
                    capabilities = DesiredCapabilities.firefox();

                } else if (System.getProperty("Browser").equalsIgnoreCase("chrome")) {
                    capabilities = DesiredCapabilities.chrome();
                }
               // capabilities = DesiredCapabilities.chrome();
                capabilities.setPlatform(Platform.WINDOWS);
                capabilities.setVersion("48");
                capabilities.setCapability("browserstack.debug", "true");

                URL url = new URL(AutomationConstants.SELENIUM_GRID_URL);
                driver = new RemoteWebDriver(url, capabilities);
                driver.get(AutomationConstants.URL);
                System.out.println("title is " + driver.getTitle());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/main/Browsers/geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/main/Browsers/chromedriver.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                driver = new ChromeDriver(capabilities);
            } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "src/main/Browsers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Safari")) {
                System.setProperty("webdriver.ie.driver", "src/main/Browsers/SafariDriver.exe");
                driver = new SafariDriver();
            }

            driver.manage().deleteAllCookies();
            driver.get(AutomationConstants.URL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    public static void stopBrowser() {
        driver.quit();
    }
}