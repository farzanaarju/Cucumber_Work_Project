
Feature: Login into Osa Forum page feature
 @Forum 
  Scenario Outline: Only registered student can login the page with valid username and password
    Given I am already in Osa forum page
    When Now I have to type valid Username_<username>
    And Next I have to type valid Password_<password>
    Then I have to press the login button
    And Next verify the login page
    Then I have to click the interview questions button
    Then I have to click the student page button 
    Then Verify the student login page
    And After verify click log out
    Then I have to close the browser
    
    Examples:
   |         username       |     password      | 
   |"arjuarju2015@gmail.com"|"Suhanaalvina2015$"|
   
