$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/a.feature");
formatter.feature({
  "name": "US_01 success register with valid and invalid credentials",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US_01"
    }
  ]
});
formatter.scenario({
  "name": "TC_0101 User verifies login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_01"
    },
    {
      "name": "@TC_0101"
    }
  ]
});
formatter.step({
  "name": "User enters the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_enters_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the log in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_clicks_the_log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see his name on the left side of the page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_can_see_his_name_on_the_left_side_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see accounts overview",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_is_able_to_see_accounts_overview()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see total balance under the accounts",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_is_able_to_see_total_balance_under_the_accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks log out button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_clicks_log_out_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_0102 User enters invalid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0102"
    }
  ]
});
formatter.step({
  "name": "User enters the main page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters false username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks the log in button",
  "keyword": "And "
});
formatter.step({
  "name": "User can not log in and verifies the Error message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "TC_0102 invalid username and password",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "tony",
        "kay4-gj"
      ]
    },
    {
      "cells": [
        "boby5",
        "21iopd-5"
      ]
    },
    {
      "cells": [
        "TOMTOM",
        "lfap-?5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC_0102 User enters invalid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US_01"
    },
    {
      "name": "@TC_0102"
    }
  ]
});
formatter.step({
  "name": "User enters the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_enters_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters false username \"tony\" and password \"kay4-gj\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_enters_false_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the log in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_clicks_the_log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not log in and verifies the Error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_can_not_log_in_and_verifies_the_Error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0102 User enters invalid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US_01"
    },
    {
      "name": "@TC_0102"
    }
  ]
});
formatter.step({
  "name": "User enters the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_enters_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters false username \"boby5\" and password \"21iopd-5\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_enters_false_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the log in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_clicks_the_log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not log in and verifies the Error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_can_not_log_in_and_verifies_the_Error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_0102 User enters invalid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US_01"
    },
    {
      "name": "@TC_0102"
    }
  ]
});
formatter.step({
  "name": "User enters the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_enters_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters false username \"TOMTOM\" and password \"lfap-?5\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_enters_false_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the log in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_clicks_the_log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not log in and verifies the Error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US01Login.user_can_not_log_in_and_verifies_the_Error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});