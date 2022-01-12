Feature: Verifying our osa home page title
@Home
  Scenario: Check the osa home page title
    Given I open chrome browser
    When I nevigate to osa  Home page
    Then I verify the title
    And I close browser
@About
  Scenario: Verify the about page Title
    Given I open chrome browser
    When I nevigate to osa  Home page
    Then I have to click the About page
    Then After clicking i need to verify the title
    And I will click This three buttons Our_Mission Our_Vision & Our_Value
