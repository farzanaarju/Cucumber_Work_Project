Feature: Verifying our osa home page title
 Background:
    Given I open chrome browser
    When I navigate to osa  Home page
  

  @Home
  Scenario: Check the osa home page title
    Then I verify the title
    And I have to close the browser

  @About
  Scenario: Verify the about page Title
    Then I have to click the About page
    Then After clicking i need to verify the title
    And I will click This three buttons Our_Mission Our_Vision & Our_Value
    And I have to close the browser
