package com.geissonlucaso.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match(
    @SerializedName("description")
    val description: String,
    @SerializedName("place")
    val place: Place,
    @SerializedName("homePlayer")
    val homeTeam: Team,
    @SerializedName("awayPlayer")
    val awayTeam: Team
) : Parcelable