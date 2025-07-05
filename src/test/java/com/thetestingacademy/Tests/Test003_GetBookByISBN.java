package com.thetestingacademy.Tests;

import com.thetestingacademy.Base.BaseTest;
import com.thetestingacademy.EndPoints.API_Constants;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class  Test003_GetBookByISBN extends BaseTest {

    @Test
    public void GetByISBN() {
        // Prep of Req
        requestSpecification.basePath("/BookStore/v1/Book")
                .queryParam("ISBN","9781449337711");
        // Making of the Request
       // response = RestAssured.given(requestSpecification).when().body(payLoadManager.setAuthPayload()).post();
        response = RestAssured.given(requestSpecification).when().get();
        System.out.println("string output is::"+response.asString());
          assertActions.verifyStatusCode(response,200);
        String ISBN_Book = payLoadManager.getISBNFromJSON(response.asString());
        System.out.println(ISBN_Book);
    }
}

