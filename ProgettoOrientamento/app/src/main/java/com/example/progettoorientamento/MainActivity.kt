package com.example.progettoorientamento

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailField = findViewById<EditText>(R.id.emailField)
        var passwordField = findViewById<EditText>(R.id.passwordField)
        var loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            if(emailField.text.toString() == "italia"){
                if(passwordField.text.toString() == "12345678"){
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                } else {
                    val snackbar = Snackbar.make(
                        findViewById(android.R.id.content),
                        "password invalido",
                        Snackbar.LENGTH_LONG
                    )
                    snackbar.show()
                }
            }else{
                val snackbar = Snackbar.make(
                    findViewById(android.R.id.content),
                    "email invalido",
                    Snackbar.LENGTH_LONG
                )
                snackbar.show()
            }

        }

    }
}