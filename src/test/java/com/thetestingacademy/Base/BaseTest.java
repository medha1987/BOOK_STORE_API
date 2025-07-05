package com.thetestingacademy.Base;

import com.thetestingacademy.EndPoints.API_Constants;
import com.thetestingacademy.Modules.PayLoadManager;
import com.thetestingacademy.asserts.AssertActions;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.restassured.RestAssured;


public class BaseTest {

    // CommonToAll Testcase
    //   // Base URL, Content Type - json - common
    public RequestSpecification requestSpecification;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;
    public PayLoadManager payLoadManager;
    public AssertActions assertActions;

    @BeforeTest
    public void setup() {
        System.out.println("Starting of the Test");
        payLoadManager = new PayLoadManager();
        assertActions = new AssertActions();

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri(API_Constants.BASE_URL);
        requestSpecification.contentType(ContentType.JSON).log().all();
    }

    /*public  String getToken(){
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri(API_Constants.BASE_URL)
                .basePath(API_Constants.AUTH_URL);
        // Setting the payload
        String payload = payLoadManager.setAuthPayload();
        // Get the Token
        response = requestSpecification.contentType(ContentType.JSON).body(payload).when().post();
        String token = payLoadManager.getTokenFromJSON(response.asString());
        return token;

    }*/


    @AfterTest
    public void tearDown() {
        System.out.println("Finished the Test!");
    }
}
