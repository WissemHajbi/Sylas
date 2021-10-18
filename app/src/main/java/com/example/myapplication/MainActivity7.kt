package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main7.*

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        vid()
    }
    fun vid(){
        val media=MediaController(this)
        media.setAnchorView(cenimatic)
        val path= Uri.parse("android.resource://$packageName/${R.raw.cenimatic}")
        cenimatic.setVideoURI(path)
        cenimatic.setMediaController(media)
        cenimatic.start()
    }
}