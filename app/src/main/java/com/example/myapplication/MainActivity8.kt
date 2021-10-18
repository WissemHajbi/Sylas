package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main8.*

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        storycover1.setOnClickListener{
            storytitle.setText(R.string.shacklestitle)
            storytext.setText(R.string.shacklesstory)
        }
        storycover2.setOnClickListener{
            storytitle.setText(R.string.recruittitle)
            storytext.setText(R.string.recruitstory)
        }
        storycover3.setOnClickListener{
            storytitle.setText(R.string.turmoiltitle)
            storytext.setText(R.string.turmoilstory)
        }
    }
}