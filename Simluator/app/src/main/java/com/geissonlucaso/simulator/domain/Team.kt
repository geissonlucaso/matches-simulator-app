package com.geissonlucaso.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(

    @SerializedName("name")
    val name: String,
    @SerializedName("power")
    val power: Int,
    @SerializedName("picture")
    val picture: String,
    var score: Int?
) : Parcelable