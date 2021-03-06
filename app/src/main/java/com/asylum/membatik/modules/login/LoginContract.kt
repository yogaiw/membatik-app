package com.asylum.membatik.modules.login

interface LoginContract {
    interface View {
        fun setOnClickListener()
        fun showMessage(msg: String)
        fun processingLogin(isProcessingLogin: Boolean)
        fun goToDashboard()
        fun goToRegister()
    }

    interface Presenter {
        fun doLogin(email: String, password: String)
    }
}