package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            //Iniciar um intent
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
            finish()
        }, 5000)
    }
}