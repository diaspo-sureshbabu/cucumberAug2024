Feature: Functional validation of salesforce login page (after word Feature colon should present)


  @SF_sc1
  Scenario: validation of login functionality
  Given user navigates to salesforce login page
  When user enter the username "username1" and Password "password1"
  And user click the login button
  Then user validate the navigation to the home page
  @SF_sc2
  Scenario: validation of error message
  Given user navigates to salesforce login page
  When user enter the username "user&&&name1" and Password "pass**word1"
  And user click the login button
  Then user validate the error message