package com.example.tv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class slide2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide2)

        var handler = Handler()
        handler.postDelayed({

            val splsh = Intent(this, slide3::class.java)

            startActivity(splsh)
            Animatoo.animateSwipeRight(this)
            finishAffinity()

        }, 5000)

    }

    override fun onBackPressed() {
        finishAffinity()
        super.onBackPressed()
    }
}