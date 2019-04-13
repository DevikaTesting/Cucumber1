#Author: your.email@your.domain.com

@tag
Feature: To test add tariff plan
  

  @tag1
  Scenario: To validate the success message
    Given The user is in the add tariff plan page
    When The user fill in the tariff details
    |100|200|300|400|500|600|700|
    When The user clicks the submit Button
    Then The user should see the success meassage
    
    
    @tag2
    Scenario: the user will see the alert message 
    Given The user is in the add tariff plan
    When the user clicks the Submit Button
    Then the user should see the Alert message
    
    @tag3
    Scenario: the user will see the error message
    Given the user is in the add tariff plan
    When the user fill in the details
    |abc|abcd|mkl|yui|abc|abc|yut|
    When the user clicks the Submitt Button
    Then The user should see the Error message

  
   

  