package com.example.projectbp2667

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    //intent explicit
    //instance
    val btnlogin:Button = findViewById(R.id.button)
    val  txtUsername:EditText = findViewById(R.id.editTextText)
    }
}