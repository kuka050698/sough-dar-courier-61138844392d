/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 15/08/2018.
 */

package kz.darlogistics.courier.auth.login
import android.support.v4.app.Fragment
import kz.darlogistics.courier.auth.AuthContract
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

/**
 * View that allows users to log in
 */
class LoginFragment : Fragment(), AuthContract.LoginView {

    override val presenter: AuthContract.LoginPresenter by inject { parametersOf(this) }

    override fun onLoginSuccess() {

    }

    override fun onLoginError(message: String) {

    }
}