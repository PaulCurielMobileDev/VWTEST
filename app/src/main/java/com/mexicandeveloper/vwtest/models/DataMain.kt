package com.mexicandeveloper.vwtest.models

import com.google.gson.annotations.SerializedName

data class DataMain(
    @SerializedName("children") var children: List<Children> = emptyList<Children>()
)
