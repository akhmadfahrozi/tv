package com.example.tv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class agenda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)


        var handler = Handler()
        handler.postDelayed({

            val splsh = Intent(this, MainActivity::class.java)
            startActivity(splsh)
            Animatoo.animateSwipeRight(this)
            finishAffinity()

        }, 5000)}

    override fun onBackPressed() {
        finishAffinity()
        super.onBackPressed()
    }

    }
