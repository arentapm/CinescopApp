package com.example.chinescopapp;

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import android.annotation.SuppressLint
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import missing.namespace.R
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity1


class MainActivity : AppCompatActivity1() {

    @SuppressLint("WrongViewCast") override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val forgotPasswordTextView = findViewById<TextView>(R.id.forgotPasswordTextView)
        val googleLoginButton = findViewById<Button>(R.id.googleLoginButton)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()) {
                Snackbar.make(it, "Logging in...", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(it, "Please fill in all fields", Snackbar.LENGTH_SHORT).show()
            }
        }

        forgotPasswordTextView.setOnClickListener {
            Snackbar.make(it, "Forgot Password clicked", Snackbar.LENGTH_SHORT).show()
        }

        googleLoginButton.setOnClickListener {
            Snackbar.make(it, "Google Sign In clicked", Snackbar.LENGTH_SHORT).show()
        }
    }
}
