package com.galaxe.animationsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: ImageView
    lateinit var fadeIn: Button
    lateinit var fadeOut: Button
    lateinit var zoomIn: Button
    lateinit var zoomOut: Button
    lateinit var slideDown: Button
    lateinit var slideUp: Button
    lateinit var bounce: Button
    lateinit var rotate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.galaxe)
        fadeIn = findViewById(R.id.fade_in)
        fadeOut = findViewById(R.id.fade_out)
        zoomIn = findViewById(R.id.zoom_in)
        zoomOut = findViewById(R.id.zoom_out)
        slideDown = findViewById(R.id.slide_down)
        slideUp = findViewById(R.id.slide_up)
        bounce = findViewById(R.id.bounce)
        rotate = findViewById(R.id.rotate)

        fadeIn.setOnClickListener {
            textView.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textView.startAnimation(animation)
        }
        fadeOut.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            textView.startAnimation(animation)
            Handler().postDelayed({
                textView.visibility = View.GONE
            }, 1000)
        }
        zoomIn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            textView.startAnimation(animation)
        }
        zoomOut.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            textView.startAnimation(animation)
        }
        slideDown.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            textView.startAnimation(animation)
        }
        slideUp.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            textView.startAnimation(animation)
        }
        bounce.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            textView.startAnimation(animation)
        }
        rotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textView.startAnimation(animation)
        }

    }

}