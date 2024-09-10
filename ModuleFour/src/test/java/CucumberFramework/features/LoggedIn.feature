Feature: LoggedIn User vieew

  Scenario: Validate User is able to view after login
    Given User Navigates to the login page
    When User successfully enters the login details
    Then User shouldbe able to view the product category page
