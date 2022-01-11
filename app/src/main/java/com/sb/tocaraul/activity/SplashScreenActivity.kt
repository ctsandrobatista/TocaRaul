package com.sb.tocaraul.activity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MotionEvent
import android.widget.VideoView
import com.sb.tocaraul.R


class SplashScreenActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            val videoHolder = VideoView(this)
            setContentView(videoHolder)
            val video = Uri.parse("android.resource://" + packageName + "/" + R.raw.sb_splash)
            videoHolder.setVideoURI(video)
            videoHolder.setOnCompletionListener { jump() }
            videoHolder.start()
        } catch (ex: Exception) {
            jump()
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        jump()
        return true
    }

    private fun jump() {
        if (isFinishing) return
        startActivity(Intent(this, PrincipalActivity::class.java))
        finish()
    }
}