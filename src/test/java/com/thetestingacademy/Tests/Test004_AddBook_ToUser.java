package com.thetestingacademy.Tests;

import com.thetestingacademy.Base.BaseTest;
import com.thetestingacademy.EndPoints.API_Constants;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test004_AddBook_ToUser extends BaseTest {


    @Test
    public void CreateToken() {
        // Prep of Req
        requestSpecification.basePath(API_Constants.Add_Book);
        System.out.println(requestSpecification);
        // Making of the Request
        response = RestAssured.given(requestSpecification).when().body(payLoadManager.setAuthPayload()).post();
    }
}