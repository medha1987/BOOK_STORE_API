package com.thetestingacademy.Modules;

import com.google.gson.Gson;
import com.thetestingacademy.Pojos.Request.Add_Book;
import com.thetestingacademy.Pojos.Request.CollectionOfIsbn;
import com.thetestingacademy.Pojos.Request.Create_user;
import com.thetestingacademy.Pojos.Response.Book;
import com.thetestingacademy.Pojos.Response.GETALLBooks;
import com.thetestingacademy.Pojos.Response.TokenGenerated;

public class PayLoadManager {
    Gson gson;

    // Java Object -> JSON
    public String setAuthPayload() {
        Create_user auth = new Create_user();
        auth.setUserName("medha_user123");
        auth.setPassword("Medha@1234");
        gson = new Gson();
        String jsonPayloadString = gson.toJson(auth);
        System.out.println("Payload set to the -> " + jsonPayloadString);
        return jsonPayloadString;

    }

    // DeSer ( JSON String -> Java Object
    public String getTokenFromJSON(String tokenResponse) {
        gson = new Gson();
        TokenGenerated tokenResponse1 = gson.fromJson(tokenResponse, TokenGenerated.class);
        return tokenResponse1.getToken();


    }
    public String getISBNFromJSON(String tokenResponse) {
        gson = new Gson();
        Book Book1 = gson.fromJson(tokenResponse, Book.class);

        System.out.println("isbn:"+Book1.getIsbn());
        return Book1.getIsbn();

        /*public String AddBookUser() {
            Add_Book add = new Add_Book();
            add.setUserId("0b1a43f4-b2f8-4c18-a4f0-fbcfc332d32f");
            CollectionOfIsbn isbn=new CollectionOfIsbn();
            isbn.setIsbn("9781449325862");

            gson = new Gson();
            String jsonPayloadString = gson.toJson(auth);
            System.out.println("Payload set to the -> " + jsonPayloadString);
            return jsonPayloadString;

        }*/

    }

   /* public String getAllBooks(String Response) {
        gson = new Gson();
        GETALLBooks Response1=gson.fromJson(Response, GETALLBooks.class);
        retrun Response1.getBooks;
    }*/


}
