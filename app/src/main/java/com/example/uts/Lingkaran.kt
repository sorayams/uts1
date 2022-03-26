package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Lingkaran : AppCompatActivity() {
    //membuat variable penampung
    lateinit var btnHitung : Button
    lateinit var numJarijari : EditText
    lateinit var numHasil : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)

        //connect variable dengan tampilan
        btnHitung = findViewById(R.id.btnHitung)
        numJarijari = findViewById(R.id.numJarijari)
        numHasil = findViewById(R.id.numHasil)

        btnHitung.setOnClickListener{
            //trigger perhitungan
            val jarijari : Int = Integer.parseInt(numJarijari.text.toString())
            val hasil : Double = 3.14 * jarijari * jarijari

            numHasil.setText(hasil.toString())

        }
    }
}

