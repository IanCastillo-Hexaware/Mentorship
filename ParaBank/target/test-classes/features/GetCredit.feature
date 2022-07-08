
Feature: Retrive Credit

  Scenario: New User
    Given User is on landing page
    And User goes to register page
    And User enters this info "Peter", "Smith", "Washington Ave", "Washington DC", "Washington", "00000", "1234567890", "999999", "psmith", "psmith123"
    When User opens new account
    And User clicks the new account ID link
    Then Credit Value is displayed
    