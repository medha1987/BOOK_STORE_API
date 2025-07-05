package com.thetestingacademy.Tests;

import com.thetestingacademy.Base.BaseTest;
import com.thetestingacademy.EndPoints.API_Constants;
import io.restassured.RestAssured;;
import org.testng.annotations.Test;

public class LoginGenerateToken extends BaseTest {

    @Test
    public void CreateToken(){
        // Prep of Req
        requestSpecification.basePath(API_Constants.Generate_Token);

        // Making of the Request
        response = RestAssured.given(requestSpecification).when().body(payLoadManager.setAuthPayload()).post();
        // Extraction ( JSON String response to Java Object
        String token = payLoadManager.getTokenFromJSON(response.asString());
        System.out.println(token);

        // Validation of the request.
        assertActions.verifyStringKeyNotNull(token);
    }

}
