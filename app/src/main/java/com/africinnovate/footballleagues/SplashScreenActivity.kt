package com.africinnovate.footballleagues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this, Selection::class.java))
            finish()
        }, 5000)

    }
}