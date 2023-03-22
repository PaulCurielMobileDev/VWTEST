package com.mexicandeveloper.vwtest.models

import com.google.gson.annotations.SerializedName

data class InfoResponse(

@SerializedName("kind" ) var kind : String? = null,
@SerializedName("data" ) var data : DataMain?   = DataMain()

)
