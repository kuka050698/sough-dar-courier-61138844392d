package kz.darlogistics.courier.auth.login

import android.graphics.Paint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import kz.darlogistics.courier.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login_view_restore_password_action.paintFlags = Paint.UNDERLINE_TEXT_FLAG
    }
    private fun onClickRestorePasswordAction(view:View){

    }
    private fun onClickLogin(view:View){

    }
    private fun onClickRegister(view:View){

    }
}
