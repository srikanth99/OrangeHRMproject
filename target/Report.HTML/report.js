$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Smoke.feature");
formatter.feature({
  "line": 1,
  "name": "End2End",
  "description": "As a Admin user\r\nI want to Login the Application\r\nSo that I can navigate to different facilities of the application",
  "id": "end2end",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Login the Application",
  "description": "",
  "id": "end2end;login-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is in the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "he provides the Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "He is able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsInTheLoginPage()"
});
formatter.result({
  "duration": 284541761,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heProvidesTheUsernameAndPassword()"
});
formatter.result({
  "duration": 398952856,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heIsAbleToLogin()"
});
formatter.result({
  "duration": 143185581,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "navigate to Add Employee section in PIM",
  "description": "",
  "id": "end2end;navigate-to-add-employee-section-in-pim",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "user is in the Dashboard Page logged in as admin",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "he access Add Employee tab from PIM Menu",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "he navigates to Add employee page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsInTheDashboardPageLoggedInAsAdmin()"
});
formatter.result({
  "duration": 5521560131,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heAccessAddEmployeeTabFromPIMMenu()"
});
formatter.result({
  "duration": 7089276939,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heNavigatesToAddEmployeePage()"
});
formatter.result({
  "duration": 155908873,
  "status": "passed"
});
formatter.scenario({
  "line": 62,
  "name": "Add employee with valid details",
  "description": "",
  "id": "end2end;add-employee-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 61,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 63,
  "name": "user is in Add EmployeeTab",
  "keyword": "Given "
});
formatter.step({
  "line": 64,
  "name": "He provides valid employee details",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "he is navigated to Personal Details page of PIM",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsInAddEmployeeTab()"
});
formatter.result({
  "duration": 187352331,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heProvidesValidEmployeeDetails()"
});
formatter.result({
  "duration": 2532226578,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heIsNavigatedToPersonalDetailsPageOfPIM()"
});
formatter.result({
  "duration": 5978461423,
  "status": "passed"
});
});