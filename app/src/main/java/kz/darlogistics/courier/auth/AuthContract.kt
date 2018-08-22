/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 14/08/2018.
 */

package kz.darlogistics.courier.auth

import io.reactivex.Observable
import kz.darlogistics.courier.auth.entity.LoginStatus
import kz.darlogistics.courier.core.util.IPresenter
import kz.darlogistics.courier.core.util.IView

/**
 * Contract, that holds all views and presenters for Auth operations
 */
interface AuthContract {
    interface LoginView : IView<LoginPresenter> {

        fun onLoginSuccess()

        fun onLoginError(message: String)
    }

    interface LoginPresenter : IPresenter<LoginView> {

        fun loginUser(email: String, pass: String)
    }

    interface LoginRepository {

        fun login(email: String, pass: String): Observable<LoginStatus>
    }
}