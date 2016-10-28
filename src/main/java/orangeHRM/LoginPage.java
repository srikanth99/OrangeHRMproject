package orangeHRM;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AutomationConstants;

/**
 * Created by theop on 24/10/2016.
 */
public class LoginPage extends BasePage {
    Logger LOGGER = Logger.getLogger(LoginPage.class);

    @FindBy(id = "txtUsername")
    WebElement username;
    @FindBy(id = "txtPassword")
    WebElement password;
    @FindBy(id = "btnLogin")
    WebElement login;
    @FindBy(id = "welcome")
    WebElement welcomeMessage;
    @FindBy(linkText = "Logout")
    WebElement aboutLink;

    public String isInLoginPage() {

        String loginPageURL = driver.getCurrentUrl();
        return loginPageURL;
    }

    public void providesUsernameNPassword() {
        username.sendKeys(AutomationConstants.USERNAME);
        password.sendKeys(AutomationConstants.PASSWORD);
    }

    public void logsIn() {
        login.click();
    }

    public void logout() {
        welcomeMessage.click();
        aboutLink.click();
    }
}