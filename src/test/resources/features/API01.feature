@API01 @SmokeTest
Feature: API01 Verify account and customer pairs and transaction

  @TC0101API
  Scenario: TC0101API Account verify
    Given Use API1 endpoint "http://parabank.parasoft.com/parabank/services/bank/accounts/13566"
    And Get all the information of accounts of the customer
    And Assert API1 the status code is 200
    Then Assert customerId is "12434"

  @TC0102API
  Scenario: TC0102API Transaction verify
    Given Use API2 endpoint "http://parabank.parasoft.com/parabank/services/bank/accounts/13566/transactions"
    And Get all the transactions of the customer
    And Assert API2 the status code is 200
    And Verify the number of transaction as 3
    And verify the first id of transaction is 14476
    Then verify the amount of third transaction is "500.0"
