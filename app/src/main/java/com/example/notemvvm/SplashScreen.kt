package com.example.notemvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : AppCompatActivity() {

    var img = findViewById(R.id.imageView) as ImageView
    var text = findViewById(R.id.iSoftText) as TextView

    var top = AnimationUtils.loadAnimation(this,R.anim.top)
    var bottom = AnimationUtils.loadAnimation(this,R.anim.bottom)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        img.setAnimation(top)
        text.setAnimation(bottom)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)


    }
}