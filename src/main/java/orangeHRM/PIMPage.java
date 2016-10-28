package orangeHRM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by theop on 27/10/2016.
 */
public class PIMPage extends BasePage {

    @FindBy(css = "a[id$='_viewPimModule']")
    WebElement pimMenu;
    @FindBy(css = "a[id$='_addEmployee']")
    WebElement addEmployee;
    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement addEmployeeText;
    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "employeeId")
    WebElement employeeId;
    @FindBy(id = "chkLogin")
    WebElement checkBox;
    @FindBy(id = "user_name")
    WebElement newUserName;
    @FindBy(id = "user_password")
    WebElement newUserPassword;
    @FindBy(id = "re_password")
    WebElement confirmNewUserPassword;
    @FindBy(id = "status")
    WebElement newUserStatus;
    @FindBy(id = "location")
    WebElement newUserLocation;
    @FindBy(id = "btnSave")
    WebElement newUserSaveBtn;
    @FindBy(xpath = ("//div[@class='head']/h1"))
    WebElement personalDetails;

    public void navigateToAddEmployee() {
        pimMenu.click();
        addEmployee.click();
    }

    public String checkAdminIsInAddEmployeePage() {
        String addEmpText = addEmployeeText.getText();
        return addEmpText;
    }
    public void provideEmployeeDetails() {
        firstName.sendKeys("Nathalie");
        lastName.sendKeys("Smith");
        employeeId.clear();
        employeeId.sendKeys(Integer.toString(new Random().nextInt()));

        checkBox.click();
        newUserName.sendKeys("Nat"+Integer.toString(new Random().nextInt()));
        newUserPassword.sendKeys("testing");
        confirmNewUserPassword.sendKeys("testing");
    }

    public void statusDropDownSelection() {
        WebElement statusRoleDropDown = newUserStatus;
        Select statusRoleDropDownValue = new Select(statusRoleDropDown);
        statusRoleDropDownValue.selectByVisibleText("Enabled");
    }

    public void locationDropDownSelection() {
        WebElement locationDropDown = newUserLocation;
        Select locationDropDownValue = new Select(locationDropDown);
        locationDropDownValue.selectByVisibleText("British Development Center");
    }

    public void newUserSave() {
        newUserSaveBtn.click();
    }

    public String personalDetailsPage() {
        String personalDetailsPage = personalDetails.getText();
        return personalDetailsPage;
    }
}

