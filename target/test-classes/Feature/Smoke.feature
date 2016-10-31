Feature: End2End
  As a Admin user
  I want to Login the Application
  So that I can navigate to different facilities of the application

  @test
  Scenario:  Login the Application
    Given User is in the Login Page
    When he provides the Username and Password
    Then He is able to login


  Scenario Outline:  Navigate from Welcome Message
    Given user is in the Dashboard Page logged in as admin
    When he access the Welcome Message
    Then he should be able to navigate to  "<pages>" page from there
    Examples:
      | pages           |
      | About           |
      | Training        |
      | Change Password |
      | Logout          |

  Scenario: Navigate from Main Menu
    Given user is in the Dashboard Page logged in as admin
    Then He should be able to access all tab from main menu

  Scenario Outline: Navigate to Tabs from More Tab
    Given user is in the Dashboard Page logged in as admin
    When he access More Tab, customer should stay in dashboard page
    Then he should be able to access "<tabs>" tab from More tab
    Examples:
      | tabs               |
      | Announcements      |
      | Dashboard          |
      | Directory          |
      | Organization Chart |
      | Assets             |

  Scenario Outline: Navigate from admin Tab
    Given user is in the Dashboard Page logged in as admin
    When he access Admin Tab
    Then He can navigate to "<adminTabs>" from there;

    Examples:
      | adminTabs       |
      | User Management |
      | Job             |
      | Organization    |
      | Nationalities   |
      | Announcements   |
      | Configuration   |
      | Audit Trail     |

  @test
  Scenario: navigate to Add Employee section in PIM
    Given user is in the Dashboard Page logged in as admin
    When he access Add Employee tab from PIM Menu
    Then he navigates to Add employee page

    @test
      Scenario: Add employee with valid details
      Given user is in Add EmployeeTab
      When He provides valid employee details
      Then he is navigated to Personal Details page of PIM



  Scenario:Navigate to System users Page from UserManagement
    Given user is in the Dashboard Page logged in as admin
    When he access users tab from User Management menu in  Admin Tab
    Then he is System User Page


  Scenario: Navigates to Add users from system User
    Given user is in SystemUser Page
    When he adds an user
    Then he navigated to add users page


  Scenario: provides Users Details
    Given user is in add Users page
    When He provides all valid details
    Then He is able to save a new user











