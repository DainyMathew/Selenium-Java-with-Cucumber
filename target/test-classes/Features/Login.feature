Feature: feature to test login functionality

  Scenario Outline: check the login functionality with valid credentials
    
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then User is navigated to the home page
    
    Examples:
   | username | password |
   | Dainy | 12345 |
   | Chicku | 12345 |
   
    
