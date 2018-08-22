/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 14/08/2018.
 */

package kz.darlogistics.courier.auth.entity

import com.google.gson.annotations.SerializedName

/**
 * Data class for login
 */
data class LoginRequest(
        @SerializedName("email") val email: String,
        @SerializedName("password") val pass: String
)