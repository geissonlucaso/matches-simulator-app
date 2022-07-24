package com.geissonlucaso.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match(
    @SerializedName("description")
    val description: String,
    @SerializedName("place")
    val place: Place,
    @SerializedName("homePlayer")
    val homeTeam: Team,
    @SerializedName("awayPlayer")
    val awayTeam: Team
)