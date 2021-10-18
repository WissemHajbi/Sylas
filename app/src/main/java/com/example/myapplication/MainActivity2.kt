package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        faker.setOnClickListener {
            skill2.setImageResource(R.drawable.ability1)
            skill1.setImageResource(R.drawable.ability2)
            skill3.setImageResource(R.drawable.ability3)
            item1.setImageResource(R.drawable.item7)
            item2.setImageResource(R.drawable.item8)
            item3.setImageResource(R.drawable.item5)
            item4.setImageResource(R.drawable.item9)
            item5.setImageResource(R.drawable.item10)
            item6.setImageResource(R.drawable.item6)
            statspic.setImageResource(R.drawable.stats1)
            runespic.setImageResource(R.drawable.runes2)
        }
        armoon.setOnClickListener {
            skill2.setImageResource(R.drawable.ability2)
            skill1.setImageResource(R.drawable.ability1)
            skill3.setImageResource(R.drawable.ability3)
            item1.setImageResource(R.drawable.item1)
            item2.setImageResource(R.drawable.item2)
            item3.setImageResource(R.drawable.item5)
            item4.setImageResource(R.drawable.item3)
            item5.setImageResource(R.drawable.item4)
            item6.setImageResource(R.drawable.item6)
            statspic.setImageResource(R.drawable.stats2)
            runespic.setImageResource(R.drawable.runes4)
        }
        nb3.setOnClickListener {
            skill2.setImageResource(R.drawable.ability2)
            skill1.setImageResource(R.drawable.ability3)
            skill3.setImageResource(R.drawable.ability1)
            item1.setImageResource(R.drawable.item11)
            item2.setImageResource(R.drawable.item5)
            item3.setImageResource(R.drawable.item12)
            item4.setImageResource(R.drawable.item14)
            item5.setImageResource(R.drawable.item17)
            item6.setImageResource(R.drawable.item10)
            statspic.setImageResource(R.drawable.stats3)
            runespic.setImageResource(R.drawable.runes1)
        }
    }

}