package com.thetestingacademy.Tests;

import com.thetestingacademy.Base.BaseTest;
import com.thetestingacademy.EndPoints.API_Constants;

import static io.restassured.RestAssured.requestSpecification;

import com.thetestingacademy.asserts.AssertActions;
import io.restassured.RestAssured;
import org.testng.annotations.Test;


public class Test002_GETAllBooks extends BaseTest {
    @Test
    public void GetAllBooks() {
        // Prep of Req
        requestSpecification.basePath(API_Constants.GET_ALL_Books);
        // Making of the Request
        response = RestAssured.given(requestSpecification).when().get();
        validatableResponse  = response.then().log().all();
        validatableResponse.statusCode(200);
        assertActions.verifyStatusCode(response,200);
    }
}