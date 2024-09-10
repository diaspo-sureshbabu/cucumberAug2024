Feature: General View

  Scenario: Validate User is able to view products without login in
    Given User Navigates to the Online products page
    When User clicks on Formal Shoes drop down
    Then User should be able to view the products