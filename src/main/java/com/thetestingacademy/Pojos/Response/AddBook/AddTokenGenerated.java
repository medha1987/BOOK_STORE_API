package com.thetestingacademy.Pojos.Response.AddBook;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thetestingacademy.Pojos.Response.AddBook.AddBook;


public class AddTokenGenerated {

    @SerializedName("books")
    @Expose
    private List<AddBook> books;

    public List<AddBook> getBooks() {
        return books;
    }

    public void setBooks(List<AddBook> books) {
        this.books = books;
    }

}
