package com.thetestingacademy.Pojos.Response.AddBook;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;




public class AddBook {

    @SerializedName("isbn")
    @Expose
    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
