Feature: Verifying our osa home page title
  Scenario: Check the osa home page title
    Given I open chrome browser
    When I nevigate to osa  Home page
    Then I verify the title
    And I close browser