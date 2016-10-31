package orangeHRM;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserFactory;

import java.util.List;

/**
 * Created by theop on 14/10/2016.
 */
public class DashBoardPage extends BasePage {

    @FindBy(linkText ="Welcome Admin")
    private WebElement dashBoardWelcome;
    @FindBy(xpath = "//div[@id='welcome-menu']/ul")
    private WebElement welcomeMessageContainer;


    Logger LOGGER = Logger.getLogger(DashBoardPage.class);

    public String userIsInDashBoardWelcome() {
        String dashBoardWelcomeText = dashBoardWelcome.getText();
        return dashBoardWelcomeText;
    }

    public void accessWelcomeMessage() {
        dashBoardWelcome.click();
        List<WebElement> containerContents = welcomeMessageContainer.findElements(By.tagName("a"));
        int containerCount = containerContents.size();
        System.out.println("Container Count =" + containerCount);
        for (WebElement temp : containerContents) {
            System.out.println("temp Text =" + temp.getText());
        }
//       String[] arrayContents = {"About", "Training", "Change Password", "Logout"};
//        //    Assert.assertEquals(4, containerCount);
    }

    public void welcomeMessageDropDown(String pages) throws InterruptedException {
        LOGGER.info("Verifying Presence of Links from Welcome Message ...");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement aboutLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(pages)));
        // WebElement aboutLink = driver.findElement(By.linkText(pages));
        String aboutLinkText = aboutLink.getText();
        Assert.assertEquals(pages, aboutLinkText);
    }

    public void listOfMenuTabs() {
        LOGGER.info("Verifying  Tabs of main menu...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        Assert.assertEquals(menuTabContents.size(), 10);
    }

    public void checkAdminMenuTab() {
        LOGGER.info("Verifying Presence of Admin tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(0).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("Admin", menuTabContentsText);
    }

    public void checkPIMMenuTab() {
        LOGGER.info("Verifying Presence of PIMPage tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(1).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("PIMPage", menuTabContentsText);
    }

    public void checkLeaveMenuTab() {
        LOGGER.info("Verifying Presence of Leave tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(2).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("Leave", menuTabContentsText);
    }

    public void checkTimeMenuTab() {
        LOGGER.info("Verifying Presence of Time tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(3).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("Time", menuTabContentsText);
    }

    public void checkRecruitmentMenuTab() {
        LOGGER.info("Verifying Presence of Recruitment tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(4).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("Recruitment", menuTabContentsText);
    }

    public void checkDisciplineMenuTab() {
        LOGGER.info("Verifying Presence of Discipline tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(5).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("Discipline", menuTabContentsText);
    }

    public void checkTrainingMenuTab() {
        LOGGER.info("Verifying Presence of Training tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(6).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("Training", menuTabContentsText);
    }

    public void checkPerformanceMenuTab() {
        LOGGER.info("Verifying Presence of Performance tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(7).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("Performance", menuTabContentsText);
    }

    public void checkOnboardingMenuTab() {
        LOGGER.info("Verifying Presence of On-Boarding tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(8).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("On-boarding", menuTabContentsText);
    }

    public void checkMoreMenuTab() {
        LOGGER.info("Verifying  Presence of More tab from Main Menu ...");
        WebElement menuTab = driver.findElement(By.xpath("//div[@class='menu']/ul"));
        List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
        String menuTabContentsText = menuTabContents.get(9).getText();
        System.out.println(menuTabContentsText);
        Assert.assertEquals("More", menuTabContentsText);
    }

    public void moreTab() {
        LOGGER.info("Verifying user still in DashBoard from MoreTab ...");
        WebElement moreTab = driver.findElement(By.id("menu_dashboard_index"));
        moreTab.click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://sbtechnos11.trial52.orangehrmlive.com/dashboard");
    }

    public void accessTabFromMoreTab(String tabs) {
        LOGGER.info("Verifying tabs available from More Tab ...");
        WebElement moreTab = driver.findElement(By.linkText(tabs));
        String moreTabText = moreTab.getText();
        Assert.assertEquals(tabs, moreTabText);
    }
}

//    public void welcomeMessageDropDown(String pages) {
//    WebElement aboutLink = driver.findElement(By.linkText(pages));
//        String aboutLinkText = aboutLink.getText();
//        Assert.assertEquals(pages,aboutLinkText);
//
//    }


