package com.geissonlucaso.simulator.domain;

import com.google.gson.annotations.SerializedName;

public class Place {

    @SerializedName("name")
    private String name;
    @SerializedName("picture")
    private String picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
