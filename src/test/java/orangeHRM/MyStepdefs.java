package orangeHRM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utils.AutomationConstants;

/**
 * Created by theop on 14/10/2016.
 */
public class MyStepdefs {

    DashBoardPage dashBoard = new DashBoardPage();
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    PIMPage pim = new PIMPage();

    @Given("^user is in the Dashboard Page logged in as admin$")
    public void userIsInTheDashboardPageLoggedInAsAdmin() throws Throwable {
        String dashBoardWelcomeText = dashBoard.userIsInDashBoardWelcome();
        Assert.assertEquals(dashBoardWelcomeText, "Welcome Admin");
    }

    @When("^he access the Welcome Message$")
    public void heAccessTheWelcomeMessage() {
        dashBoard.accessWelcomeMessage();
    }

    @Then("^he should be able to navigate to  \"([^\"]*)\" page from there$")
    public void heShouldBeAbleToNavigateToPageFromThere(String pages) throws InterruptedException {
        dashBoard.welcomeMessageDropDown(pages);
    }

    @Then("^He should be able to access all tab from main menu$")
    public void heShouldBeAbleToAccessAllTabFromMainMenu() {
        dashBoard.listOfMenuTabs();
        dashBoard.checkAdminMenuTab();
        dashBoard.checkPIMMenuTab();
        dashBoard.checkLeaveMenuTab();
        dashBoard.checkTimeMenuTab();
        dashBoard.checkRecruitmentMenuTab();
        dashBoard.checkDisciplineMenuTab();
        dashBoard.checkTrainingMenuTab();
        dashBoard.checkPerformanceMenuTab();
        dashBoard.checkOnboardingMenuTab();
        dashBoard.checkMoreMenuTab();
    }

    @When("^he access More Tab, customer should stay in dashboard page$")
    public void heAccessMoreTabCustomerShouldStayInDashboardPage() {
        dashBoard.moreTab();
    }

    @Then("^he should be able to access \"([^\"]*)\" tab from More tab$")
    public void heShouldBeAbleToAccessTabFromMoreTab(String tabs) throws Throwable {
        dashBoard.accessTabFromMoreTab(tabs);
    }

    @Given("^User is in the Login Page$")
    public void userIsInTheLoginPage() {
        String loginPageURLTest = loginPage.isInLoginPage();
        Assert.assertEquals("http://sbtechnos11.trial52.orangehrmlive.com/auth/login", loginPageURLTest);
    }

    @When("^he provides the Username and Password$")
    public void heProvidesTheUsernameAndPassword() {
        loginPage.providesUsernameNPassword();
    }

    @Then("^He is able to login$")
    public void heIsAbleToLogin() {
        loginPage.logsIn();
    }

    @When("^he access Admin Tab$")
    public void heAccessAdminTab() {
        String adminURLText = adminPage.accessAdminTab();
        Assert.assertEquals("http://sbtechnos11.trial52.orangehrmlive.com/admin/viewSystemUsers", adminURLText);
    }

    @Then("^He can navigate to \"([^\"]*)\" from there;$")
    public void heCanNavigateToFromThere(String adminTabs) {
        String accessFromAdminTabText = adminPage.navigateToAdminTabs(adminTabs);
        System.out.println("Admin tab Menus = " + accessFromAdminTabText);
        Assert.assertEquals(accessFromAdminTabText, adminTabs);
    }

    @When("^he access users tab from User Management menu in  Admin Tab$")
    public void heAccessUsersTabFromUserManagementMenuInAdminTab() {
        adminPage.accessAdminTab();
        adminPage.navigateToUserManagement();
    }

    @Then("^he is System User Page$")
    public void heIsSystemUserPage() {
        String systemUserText = adminPage.systemUsersPageIsDisplayed();
        Assert.assertEquals("System Users", systemUserText);
    }

    @Given("^user is in SystemUser Page$")
    public void userIsInSystemUserPage() {
        String systemUserPageURLText = adminPage.isInSystemUserPage();
        Assert.assertEquals(AutomationConstants.SYSTEM_USER_PAGE_URL, systemUserPageURLText);
    }

    @When("^he adds an user$")
    public void heAddsAnUser() {
        adminPage.addsAnUser();
    }

    @Then("^he navigated to add users page$")
    public void heNavigatedToAddUsersPage() {
        String checkAddusers = adminPage.navigateToAddUserPage();
        Assert.assertEquals(checkAddusers, "Add User");
    }

    @Given("^user is in add Users page$")
    public void userIsInAddUsersPage() {
        String checkAddusers = adminPage.navigateToAddUserPage();
        Assert.assertEquals(checkAddusers, "Add User");

    }

    @When("^He provides all valid details$")
    public void heProvidesAllValidDetails() {
        adminPage.essDropDownSelection();
        adminPage.supervisorRoleDropDownSelection();
        adminPage.adminRoleDropDownSelection();
        adminPage.enterEmployeeNameAndUserDetail();
        adminPage.statusDropDownSelection();
        adminPage.password();
        adminPage.confirmPassword();
    }

    @Then("^He is able to save a new user$")
    public void heIsAbleToSaveANewUser() {
        adminPage.saveUser();
    }

    @When("^he access Add Employee tab from PIM Menu$")
    public void heAccessAddEmployeeTabFromPIMMenu() {
        pim.navigateToAddEmployee();
    }

    @Then("^he navigates to Add employee page$")
    public void heNavigatesToAddEmployeePage() {
        String inEmployeePage = pim.checkAdminIsInAddEmployeePage();
        Assert.assertEquals("Add Employee", inEmployeePage);
    }

    @Given("^user is in Add EmployeeTab$")
    public void userIsInAddEmployeeTab() {
        String inEmployeePage = pim.checkAdminIsInAddEmployeePage();
        Assert.assertEquals("Add Employee", inEmployeePage);
    }

    @When("^He provides valid employee details$")
    public void heProvidesValidEmployeeDetails() {
        pim.provideEmployeeDetails();
        pim.statusDropDownSelection();
        pim.locationDropDownSelection();
        pim.newUserSave();
    }

    @Then("^he is navigated to Personal Details page of PIM$")
    public void heIsNavigatedToPersonalDetailsPageOfPIM()  {
        String personalDtlsPageText = pim.personalDetailsPage();
        Assert.assertEquals(personalDtlsPageText, "Personal Details");
    }
}
//
//    @When("^he enters Valid details$")
//    public void heEntersValidDetails() {
//        adminPage.EnterValidUserDetail();
//        adminPage.essDropDownSelection();
//        adminPage.statusDropDownSelection();
//        adminPage.supervisorRoleDropDownSelection();
//        adminPage.locationDropDownSelection();
//        adminPage.adminRoleDropDownSelection();
//    }
