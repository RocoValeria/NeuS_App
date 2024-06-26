package com.example.neusupp_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)

        val tvGoRegister = findViewById<TextView>(R.id.tv_go_to_registro)
        tvGoRegister.setOnClickListener {
            goToRegister()
        }
    }
       private fun goToRegister(){
           val i = Intent(this, RegistroActivity::class.java)
           startActivity(i)
       }
}

