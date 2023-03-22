package com.mexicandeveloper.vwtest.models

import com.google.gson.annotations.SerializedName


data class Children(

    @SerializedName("kind") var kind: String? = null,
    @SerializedName("data") var data: DataINN? = DataINN()

)