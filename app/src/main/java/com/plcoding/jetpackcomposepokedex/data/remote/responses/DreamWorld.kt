package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class DreamWorld(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val front_female: Any
)