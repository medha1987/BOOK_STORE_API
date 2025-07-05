package com.thetestingacademy.Pojos.Response;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


    public class GETALLBooks {

        @SerializedName("books")
        @Expose
        private List<Book> books;

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }

    }

