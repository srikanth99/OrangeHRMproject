package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;
import utils.Utilities;

/**
 * Created by theop on 23/10/2016.
 */
public class AdminPage extends BasePage {

    @FindBy(linkText = "Admin")
    WebElement adminTab;
    @FindBy(linkText = "User Management")
    WebElement userManagement;
    @FindBy(linkText = "Users")
    WebElement users;
    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement systemUsersPage;
    @FindBy(id = "btnAdd")
    WebElement addsAnUser;
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUser;
    @FindBy(css = "select[id$='_essRole']")
    WebElement essRole;
    @FindBy(css = "select[id$='_supervisorRole']")
    WebElement supervisorRole;
    @FindBy(css = "select[id$='_adminRole']")
    WebElement adminRole;
    @FindBy(css = "input[id$='_userName']")
    WebElement userName;
    @FindBy(css = "input[id$='_empName']")
    WebElement empName;
    @FindBy(css = "select[id$='_status']")
    WebElement status;
    @FindBy(css = "input[id$='_password']")
    WebElement password;
    @FindBy(css = "input[id$='_confirmPassword']")
    WebElement confirmPassword;
    @FindBy(id = "btnSave")
    WebElement saveUserTab;
//    @FindBy(css = "input[id$='_userName']")
//    WebElement userName;
//    @FindBy(css = "input[id$='_empName']")
//    WebElement empName;
//    @FindBy(css = "select[id$='_essRole']")
//    WebElement essRole;Default ESS
//    @FindBy(css = "select[id$='_status']")
//    WebElement status;
//    @FindBy(css = "select[id$='_supervisorRole']")
//    WebElement supervisorRole;
//    @FindBy(css = "select[id$='_location']")
//    WebElement location;
//    @FindBy(css = "select[id$='_adminRole']")
//    WebElement adminRole;


    public String accessAdminTab() {
        adminTab.click();
        String adminURL = driver.getCurrentUrl();
        return adminURL;
    }

    public String navigateToAdminTabs(String adminTabs) {
        adminTab.click();
        WebElement accessFromAdminTab = driver.findElement(By.linkText(adminTabs));
        String accessTabsFromAdminTabText = accessFromAdminTab.getText();
        return accessTabsFromAdminTabText;
    }

    public void navigateToUserManagement() {
        adminTab.click();
        Utilities.hoverOver(driver, userManagement);
        users.click();
    }

    public String systemUsersPageIsDisplayed() {
        String systemUserPageText = systemUsersPage.getText();
        return systemUserPageText;
    }

    public String isInSystemUserPage() {
        String systemUserPageURL = driver.getCurrentUrl();
        return systemUserPageURL;
    }

    public void addsAnUser() {
        addsAnUser.click();
    }

    public String navigateToAddUserPage() {
        String addUserText = addUser.getText();
        return addUserText;
    }

    public void essDropDownSelection() {
        WebElement essRoleDropDown = essRole;
        Select essRoleDropDownValue = new Select(essRoleDropDown);
        essRoleDropDownValue.selectByVisibleText("Default ESS");
    }

    public void supervisorRoleDropDownSelection() {
        WebElement supervisorRoleDropDown = supervisorRole;
        Select supervisorRoleDropDownValue = new Select(supervisorRoleDropDown);
        supervisorRoleDropDownValue.selectByVisibleText("Management");
    }

    public void adminRoleDropDownSelection() {
        WebElement adminRoleDropDown = adminRole;
        Select adminRoleDropDownValue = new Select(adminRoleDropDown);
        adminRoleDropDownValue.selectByVisibleText("HR Executive");
    }

    public void enterEmployeeNameAndUserDetail() {
        empName.sendKeys("Nathalie Smith");
        userName.sendKeys("Smith");
    }

    public void statusDropDownSelection() {
        WebElement statusRoleDropDown = status;
        Select statusRoleDropDownValue = new Select(statusRoleDropDown);
        statusRoleDropDownValue.selectByVisibleText("Enabled");
    }

    public void password() {
        password.sendKeys("Wish123");
    }

    public void confirmPassword() {
        confirmPassword.sendKeys("Wish123");
    }

    public void saveUser() {
        saveUserTab.click();
    }
}

//
//    public void EnterValidUserDetail() {
//        userName.sendKeys("Vish");
//        empName.sendKeys("Vish");
//    }
//
//    public void essDropDownSelection() {
//        WebElement essRoleDropDown = essRole;
//        Select essRoleDropDownValue = new Select(essRoleDropDown);
//        essRoleDropDownValue.selectByVisibleText("All");
//    }
//
//    public void statusDropDownSelection() {
//        WebElement statusRoleDropDown = status;
//        Select statusRoleDropDownValue = new Select(statusRoleDropDown);
//        statusRoleDropDownValue.selectByVisibleText("All");
//    }
//
//    public void supervisorRoleDropDownSelection() {
//        WebElement supervisorRoleDropDown = supervisorRole;
//        Select supervisorRoleDropDownValue = new Select(supervisorRoleDropDown);
//        supervisorRoleDropDownValue.selectByVisibleText("All");
//    }
//
//    id="location" public void locationDropDownSelection() {
//        WebElement locationDropDown = location;
//        Select locationDropDownValue = new Select(locationDropDown);
//       locationDropDownValue.selectByVisibleText("United Kingdom");
//    }
//
//    public void adminRoleDropDownSelection() {
//        WebElement adminRoleDropDown = adminRole;
//        Select adminRoleDropDownValue = new Select(adminRoleDropDown);
//        adminRoleDropDownValue.selectByVisibleText("United Kingdom");
//    }


