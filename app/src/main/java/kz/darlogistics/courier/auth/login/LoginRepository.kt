/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 15/08/2018.
 */

package kz.darlogistics.courier.auth.login

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kz.darlogistics.courier.auth.AuthContract
import kz.darlogistics.courier.auth.AuthService
import kz.darlogistics.courier.auth.entity.LoginRequest
import kz.darlogistics.courier.auth.entity.LoginResponse
import kz.darlogistics.courier.auth.entity.LoginStatus
import kz.darlogistics.courier.core.util.Logger

/**
 * Repository that provides data to LoginPresenter
 */
class LoginRepository(private val service: AuthService) : AuthContract.LoginRepository {
    override fun login(email: String, pass: String): Observable<LoginStatus> {
        return service.loginUser(LoginRequest(email, pass))
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .map { saveToken(it)
                    LoginStatus(true, "OK") }
                .observeOn(AndroidSchedulers.mainThread())
    }

    private fun saveToken(response: LoginResponse) {
        Logger.msg("Save token ${response.token}")
    }
}