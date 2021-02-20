@US_01
Feature: US_01 success register with valid and invalid credentials

  @TC_0101
  Scenario: TC_0101 User verifies login
    Given User enters the main page
    And User enters username and password
    And User clicks the log in button
    And User can see his name on the left side of the page
    And User is able to see accounts overview
    And User is able to see total balance under the accounts
    Then User clicks log out button


  @TC_0102
  Scenario Outline: TC_0102 User enters invalid username and password
    Given User enters the main page
    And User enters false username "<username>" and password "<password>"
    And User clicks the log in button
    Then User can not log in and verifies the Error message is displayed

    Examples: TC_0102 invalid username and password
      |username| password|
      |tony    | kay4-gj |
      |boby5   | 21iopd-5|
      |TOMTOM  | lfap-?5 |