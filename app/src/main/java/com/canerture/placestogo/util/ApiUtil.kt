package com.canerture.placestogo.util

import com.canerture.placestogo.data.LocationDAOInterface
import com.canerture.placestogo.data.RetrofitClient

class ApiUtil {

    companion object {
        private const val BASE_URL = "http://https://canerture.com/api/placetogoapp"

        fun getLocationDAOInterface(): LocationDAOInterface {
            return RetrofitClient.getClient(BASE_URL).create(LocationDAOInterface::class.java)
        }
    }

}