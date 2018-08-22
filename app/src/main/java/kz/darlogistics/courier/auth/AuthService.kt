/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 15/08/2018.
 */

package kz.darlogistics.courier.auth

import io.reactivex.Observable
import kz.darlogistics.courier.auth.entity.LoginRequest
import kz.darlogistics.courier.auth.entity.LoginResponse
import retrofit2.http.*

/**
 * Class that holds all HTTP requests
 */
interface AuthService {

    @POST("api/generate-token")
    fun loginUser(@Body request: LoginRequest) : Observable<LoginResponse>

}