package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Menu : AppCompatActivity() {
    //membuat variable penampung
    lateinit var btnLingkaran : Button
    lateinit var txtHello : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnLingkaran = findViewById(R.id.btnLingkaran)
        txtHello = findViewById(R.id.txtHello)

        val hello = intent.getStringExtra("hello_key")
        txtHello.setText(hello)

        btnLingkaran.setOnClickListener{
            var nextpage = Intent(this,Lingkaran::class.java)
            startActivity(nextpage)
        }
    }
}