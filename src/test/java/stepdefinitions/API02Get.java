package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.testng.Assert;
import pojos.ParaBankPojo01;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API02Get {

    Response response;
    JsonPath json;
    ObjectMapper objectMapper = new ObjectMapper();

    public void getResponse(String endPoint) {
        response = given().accept(ContentType.JSON).when().get(endPoint);
    }

    @Test
    public void TC0201API() {
        // verify the customer id is 15209 of account id 32103
        String endPoint = "http://parabank.parasoft.com/parabank/services/bank/accounts/13566";
        getResponse(endPoint);
        Assert.assertEquals(response.getStatusCode(), 200);
        json = response.jsonPath();
        System.out.println(json.getString("customerId"));
        Assert.assertEquals(json.getString("customerId"), "12434");
    }

    @Test
    public void TC0202API() {
        // verify the number of transaction as 3
        // verify the first id of transaction is 14476
        // verify the amount of third transaction is 500.0
        String endPoint = "http://parabank.parasoft.com/parabank/services/bank/accounts/13566/transactions";
        getResponse(endPoint);
        Assert.assertEquals(response.getStatusCode(), 200);
        json = response.jsonPath();
        System.out.println(json.getList("id"));
        System.out.println("Toplam transaction : " + json.getList("id").size());
        System.out.println("First transaction id info : " + json.getString("id[0]"));
        System.out.println("Third transaction amount info : " + json.getString("amount[2]"));
    }

    @Test
    public void TC0203API() throws IOException {
        // verify the number of transaction as 3
        // verify the first id of transaction is 14476
        // verify the amount of third transaction is 500.0
        String endPoint = "http://parabank.parasoft.com/parabank/services/bank/accounts/13566/transactions";
        getResponse(endPoint);
        json = response.jsonPath();
        List<Map<String, Object>> allTransactionData = json.getList("$");
        System.out.println(allTransactionData);

        // Pojo

        ParaBankPojo01[] paraBankPojo01Array = objectMapper.readValue(response.asString(), ParaBankPojo01[].class);
        System.out.println("First transaction ID (with Array) : " + paraBankPojo01Array[0].getId());

        List<ParaBankPojo01> allTransactionsList = Arrays.asList(paraBankPojo01Array);
        System.out.println("First transaction ID (with List)  : " + allTransactionsList.get(0).getId());

        String description2 = allTransactionsList.get(1).getDescription();
        System.out.println("Second Transaction Description : " + description2);

//      List<ParaBankPojo01> direktList = objectMapper.readValue(response.asString(),new TypeReference<List<ParaBankPojo01>>(){});
    }
}

