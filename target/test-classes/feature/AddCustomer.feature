#Author: your.email@your.domain.com
@tag
Feature: To test add customer
  

  @tag1
  Scenario: The user will see the customer ID generated
    Given The user is in add customer Page
    When The user fill in the customer details
    |devi |devika|mailme@gmail.com|chennai|78785|
    When The user clicks the submit button
    Then The user should see the customer Id
    
    @tag2
    Scenario: the user will see the alert message 
    Given The user is in the add customer page
    When the user clicks the submit button
    Then the user should see the alert message
    
    @tag3
    Scenario: the user should see the error message
    Given the user is in the add customer page
    When the user fill in the customer details
    |1234|5678|testme.com|chennai|abcds|
    When the user clicks the submit Button
    Then The user should see the error message

  