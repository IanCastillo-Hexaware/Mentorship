Feature: Request a loan

  Scenario: Normal loan request
    Given User is on landing page
    And Logs in with this info "psmith", "psmith123"
    When User goes for requesting a loan
    And loan amount is "1000" and down payment is "500"
    Then The loan info is displayed
