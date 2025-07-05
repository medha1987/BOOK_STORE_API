package com.thetestingacademy.Pojos.Request;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteBook {

    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("userId")
    @Expose
    private String userId;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}