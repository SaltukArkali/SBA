package APItests;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.testng.Assert;
import pojos.ParaBankPojo01;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class API01 {

    Response response;
    JsonPath json;
    ParaBankPojo01 paraBankPojo01 = new ParaBankPojo01();
    ObjectMapper objectMapper = new ObjectMapper();

    public void getResponse(String endPoint) {
        response = given().accept(ContentType.JSON).when().get(endPoint);
        response.prettyPrint();
    }

    @Test
    public void TC0101API() {
        // verify the customer id is 15209 of acoount id 32103
        String endPoint = "http://parabank.parasoft.com/parabank/services/bank/accounts/13566";
        getResponse(endPoint);
        Assert.assertEquals(response.getStatusCode(), 200);
        json = response.jsonPath();
        System.out.println(json.getString("customerId"));
        Assert.assertEquals(json.getString("customerId"), "12434");
    }

    @Test
    public void TC0102API() {
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
    public void TC0103API() throws IOException {
        // verify the number of transaction as 3
        // verify the first id of transaction is 14476
        // verify the amount of third transaction is 500.0
        String endPoint = "http://parabank.parasoft.com/parabank/services/bank/accounts/13566/transactions";
        getResponse(endPoint);
        Assert.assertEquals(response.getStatusCode(), 200);
        List<Integer> myList = new ArrayList<>();

        //    pojo01=objectMapper.readValue(response.asString(), ParaBankPojo01.class);

//      pojo01=objectMapper.readValue(response.asString(),ParaBankPojo01.class);
//        System.out.println(pojo01.getId().toString());


//
//        json=response.jsonPath();
//        System.out.println(json.getList("id"));
//        System.out.println("Toplam transaction : " +json.getList("id").size());
//        System.out.println("First transaction id info : " + json.getString("id[0]"));
//        System.out.println("Third transaction amount info : " + json.getString("amount[2]"));
    }


}
