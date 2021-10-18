package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main4.video

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        vid()
    }
    fun vid(){
        val media= MediaController(this)
        media.setAnchorView(video)
        val path= Uri.parse("android.resource://$packageName/${R.raw.ability4vid}")
        video.setMediaController(media)
        video.setVideoURI(path)
        video.start()

    }
}