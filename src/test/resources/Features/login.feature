Feature: Login

  Background:
    Given validate the browser
    When Browser is triggered
    Then check if browser is started

  @Regression
  Scenario: To test the login functionality with valid Inputs
    Given User is on login page
    When Enter valid username and password
    And Clicks on submit button
    Then User navigates to Dashboard screen.

  @Functional
  Scenario: To test the login functionality with Invalid username
    Given User is on login page
    When Enter Invalid username and valid password
    And Clicks on submit button
    Then User navigates to Dashboard screen.

  @Functional
  Scenario: To test the login functionality with Invalid password
    Given User is on login page
    When Enter valid username and Invalid password
    And Clicks on submit button
    Then User navigates to Dashboard screen.

  @Functional
  Scenario: To test the login functionality with Invalid inputs
    Given User is on login page
    When Enter Invalid username and Invalid password
    And Clicks on submit button
    Then User navigates to Dashboard screen.

  @Regression
  Scenario Outline: To test the login functionality with Multiple inputs from Scenario outline
    Given User is on login page
    When I enter Username as "<username>" and Password as "<password>"
    And Clicks on submit button
    Then User navigates to Dashboard screen.

    Examples:
      |username  | password |
      | admin    | admin    |
      | admin    | admin    |
      | admin    | admin    |
      | admin    | admin    |

  # @Smoke
  # Scenario : To test the login functionality from data tables
    # Given User is on login page
    #When I enter
    # | admin | admin |
    # And Clicks on submit button
    #Then User navigates to Dashboard screen.
