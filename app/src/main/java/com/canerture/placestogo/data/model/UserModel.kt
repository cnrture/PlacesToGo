package com.canerture.placestogo.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserModel(
    @SerializedName("id") var id: Int?,
    @SerializedName("e_mail") var eMail: String?,
    @SerializedName("name_surname") var nameSurname: String?,
    @SerializedName("nickname") var nickname: String?,
    @SerializedName("location") var location: String?
) : Serializable

