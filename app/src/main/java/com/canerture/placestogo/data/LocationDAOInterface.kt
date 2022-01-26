package com.canerture.placestogo.data

import com.canerture.placestogo.data.response.LocationResponse
import retrofit2.Call
import retrofit2.http.GET

interface LocationDAOInterface {

    @GET("/all_locations.php")
    fun allLocations(): Call<LocationResponse>

}