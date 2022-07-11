Feature: Request a loan

  Scenario Outline: Normal loan request
    Given User is on landing page
    And Logs in with this info "psmith", "psmith123"
    When User goes for requesting a loan
    And loan amount is <amount> and down payment is <dpayment>
    Then The loan info is displayed
    
 Examples:
 |amount		|dpayment	|
 |100				|50				|
 |100000		|1				|
 |12a234		|32456		|
 
