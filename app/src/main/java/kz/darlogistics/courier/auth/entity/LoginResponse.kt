/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 15/08/2018.
 */

package kz.darlogistics.courier.auth.entity

import com.google.gson.annotations.SerializedName

/**
 * Data class for Token
 */
data class LoginResponse(
        @SerializedName("access_token") val token: String,
        @SerializedName("token_type") val type: String,
        @SerializedName("expires_in") val expiresIn: String
)