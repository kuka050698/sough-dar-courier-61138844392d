/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 15/08/2018.
 */

package kz.darlogistics.courier.auth.login

import kz.darlogistics.courier.auth.AuthContract
import kz.darlogistics.courier.core.api.errorHandler.RetrofitException
import kz.darlogistics.courier.core.util.BasePresenter
import kz.darlogistics.courier.core.util.Logger

/**
 * Presenter that deliver data to LoginView
 */
class LoginPresenter(private val repository: AuthContract.LoginRepository) :
        BasePresenter<AuthContract.LoginView>(), AuthContract.LoginPresenter {

    override fun viewIsReady() {}

    override fun destroy() {}

    override fun loginUser(email: String, pass: String) {
        repository.login(email, pass).subscribe({
            Logger.msg("Login status: ${it.isLoggedIn}, ${it.message}")
        }, { it as RetrofitException
            Logger.msg("Login request error: ${it.getErrorBody()?.message}")
        })
    }
}