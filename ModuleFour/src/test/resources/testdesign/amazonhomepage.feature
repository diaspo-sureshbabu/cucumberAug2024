@amazon_feature
Feature: Amazon Homepage validations
  @amazon_sc01
  Scenario: validation of search page
  Given user navigates to amazon homepage
  When user enter the product name "iphone"
  And user clicks the search icon
  Then user verify the title of  page

  @amazon_sc02
   Scenario: Dropdown Validation
     Given user navigates to amazon homepage
     When user extracts all the values



