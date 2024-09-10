Feature: Wiki Page Automation
  @wiki_sc01
  Scenario: Verify the mapping of SHareholding and shareholder value
    Given user navigates to wiki homepage
    When user extracts the shareholder value
    And user extracts the shareholding value
    Then validate the mapping