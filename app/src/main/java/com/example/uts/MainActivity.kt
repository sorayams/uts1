package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtNama : EditText
    lateinit var txtPassword : EditText
    lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNama = findViewById(R.id.txtNama)
        txtPassword = findViewById(R.id.txtPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            var nextpage = Intent(this,Menu::class.java)
            val hello = "Hello, "  + txtNama.text.toString()
            nextpage.putExtra("hello_key", hello)
            startActivity(nextpage)
        }

    }
}