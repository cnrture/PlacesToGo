package com.canerture.placestogo.data.response
import com.canerture.placestogo.data.model.LocationModel
import com.google.gson.annotations.SerializedName

data class LocationResponse(
    @SerializedName("location") var books: List<LocationModel>,
    @SerializedName("success") var success: Int
)