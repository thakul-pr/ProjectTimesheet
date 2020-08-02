package com.example.projecttimesheet.android.app.user

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.projecttimesheet.R

class LoginActivity : AppCompatActivity() {

    private var username: EditText? = null
    private var password: EditText? = null
    private var signIn: Button? = null
    private var signUp: Button? = null
    private var forgetPassword: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initInstance()
    }

    private fun initInstance() {
        username?.findViewById<EditText>(R.id.username)
        password?.findViewById<EditText>(R.id.password)
        signIn?.findViewById<Button>(R.id.signIn)
        signUp?.findViewById<Button>(R.id.signUp)
        forgetPassword?.findViewById<TextView>(R.id.forgotPassword)
    }
}
