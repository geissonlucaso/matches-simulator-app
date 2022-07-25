package com.geissonlucaso.simulator.domain

import com.google.gson.annotations.SerializedName

data class Team(

    @SerializedName("name")
    val name: String,
    @SerializedName("power")
    val power: Int,
    @SerializedName("picture")
    val picture: String,
    var score: Int?
)