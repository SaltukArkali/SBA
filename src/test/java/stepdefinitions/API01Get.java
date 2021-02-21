package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.testng.Assert;
import pojos.ParaBankPojo01;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API01Get {

    Response response;
    JsonPath json;
    List<Map<String, Object>> allTransactionData;

    public void getResponse(String endPoint) {
        response = given().accept(ContentType.JSON).when().get(endPoint);
    }

    @Given("Use API1 endpoint {string}")
    public void use_API_endpoint(String endPoint1) {
        getResponse(endPoint1);
    }

    @Given("Get all the information of accounts of the customer")
    public void get_all_the_information_of_accounts_of_the_customer() {
        response.prettyPrint();
        json = response.jsonPath();
        System.out.println(json.get().toString());
    }

    @Given("Assert API1 the status code is {int}")
    public void assert_API1_the_status_code_is(Integer int1) {
        response.then().assertThat().statusCode(int1);
    }

    @Then("Assert customerId is {string}")
    public void assert_customerId_is(String string) {
        json = response.jsonPath();
        System.out.println(json.getString("customerId"));
        Assert.assertEquals(json.getString("customerId"), string);
    }

    @Given("Use API2 endpoint {string}")
    public void use_API2_endpoint(String endPoint2) {
        getResponse(endPoint2);
    }

    @Given("Get all the transactions of the customer")
    public void get_all_the_transactions_of_the_customer() {
        json = response.jsonPath();
        allTransactionData = json.getList("$");
        System.out.println(allTransactionData);
        WriteToTxt.saveDataInFileWithJsonListMap("API01.csv",allTransactionData);
    }

    @Given("Assert API2 the status code is {int}")
    public void assert_API2_the_status_code_is(Integer int1) {
        response.then().assertThat().statusCode(int1);
        //     Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Given("Verify the number of transaction as {int}")
    public void verify_the_number_of_transaction_as(Integer int1) {
        System.out.println(allTransactionData.size());
        System.out.println(json.getList("id"));
        System.out.println("Toplam transaction : " + json.getList("id").size());
        Assert.assertTrue(int1.equals(json.getList("id").size()));
        int size = allTransactionData.size();
        Assert.assertTrue(int1.equals(size));
    }

    @Given("verify the first id of transaction is {int}")
    public void verify_the_first_id_of_transaction_is(Integer int1) {
        Assert.assertTrue(int1.equals(allTransactionData.get(0).get("id")));
        System.out.println("First transaction id info : " + json.getString("id[0]"));
    }

    @Then("verify the amount of third transaction is {string}")
    public void verify_the_amount_of_third_transaction_is(String string1) {
        Assert.assertTrue(string1.equals(allTransactionData.get(2).get("amount").toString()));
        System.out.println("Third transaction amount info : " + json.getString("amount[2]"));
    }

}



