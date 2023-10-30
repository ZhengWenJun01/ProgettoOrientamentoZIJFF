package com.example.progettoorientamento

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailField = findViewById<EditText>(R.id.emailField)
        var passwordField = findViewById<EditText>(R.id.passwordField)
        var loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            if(passwordField.text.toString() == "12345678"){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

    }
}