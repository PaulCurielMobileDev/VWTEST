package com.mexicandeveloper.vwtest.models

import com.google.gson.annotations.SerializedName

data class DataINN(

    @SerializedName("title") var title: String? = null,
    @SerializedName("author") var author: String? = null,
    )
