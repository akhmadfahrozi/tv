package com.example.tv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.activity.OnBackPressedCallback
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var handler = Handler()
        handler.postDelayed({

            val splsh = Intent(this, slide2::class.java)

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
