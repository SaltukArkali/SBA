$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/API01.feature");
formatter.feature({
  "name": "API01 Verify account and customer pairs and transaction",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@API01"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "name": "TC0101API Account verify",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API01"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@TC0101API"
    }
  ]
});
formatter.step({
  "name": "Use API1 endpoint \"http://parabank.parasoft.com/parabank/services/bank/accounts/13566\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.API01Get.use_API_endpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get all the information of accounts of the customer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.API01Get.get_all_the_information_of_accounts_of_the_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assert API1 the status code is 200",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.API01Get.assert_API1_the_status_code_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assert customerId is \"12434\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.API01Get.assert_customerId_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC0102API Transaction verify",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API01"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@TC0102API"
    }
  ]
});
formatter.step({
  "name": "Use API2 endpoint \"http://parabank.parasoft.com/parabank/services/bank/accounts/13566/transactions\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.API01Get.use_API2_endpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get all the transactions of the customer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.API01Get.get_all_the_transactions_of_the_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assert API2 the status code is 200",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.API01Get.assert_API2_the_status_code_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the number of transaction as 3",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.API01Get.verify_the_number_of_transaction_as(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the first id of transaction is 14476",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.API01Get.verify_the_first_id_of_transaction_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the amount of third transaction is \"500.0\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.API01Get.verify_the_amount_of_third_transaction_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});