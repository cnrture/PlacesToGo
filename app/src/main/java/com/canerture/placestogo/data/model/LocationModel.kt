package com.canerture.placestogo.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LocationModel(
    @SerializedName("id") var id: Int? = 0,
    @SerializedName("owner") var owner: String?,
    @SerializedName("longitude") var longitude: String?,
    @SerializedName("latitude") var latitude: String?,
    @SerializedName("list_name") var list_name: String?
) : Serializable