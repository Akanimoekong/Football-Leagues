package com.africinnovate.footballleagues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        val laligabtn = findViewById<Button>(R.id.btn_laliga)
        laligabtn.setOnClickListener {
            val intent = Intent(this, LaligaLeague::class.java)
            startActivity(intent)
        }
    }
}