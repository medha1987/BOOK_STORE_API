package com.thetestingacademy.Pojos.Request;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Add_Book {

    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("collectionOfIsbns")
    @Expose
    private List<CollectionOfIsbn> collectionOfIsbns;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CollectionOfIsbn> getCollectionOfIsbns() {
        return collectionOfIsbns;
    }

    public void setCollectionOfIsbns(List<CollectionOfIsbn> collectionOfIsbns) {
        this.collectionOfIsbns = collectionOfIsbns;
    }

}