package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array= arrayOf(R.drawable.cover1,R.drawable.cover2,R.drawable.cover3,R.drawable.cover4,R.drawable.cover5)
        var num:Int
        do{
            num=(Math.random()*5).toInt()
        }while(num<0 || num>5)
        maincover.setImageResource(array[num])
        maincover.setOnClickListener{
            do{
                num=(Math.random()*5).toInt()
            }while(num<0 || num>5)
            maincover.setImageResource(array[num])
        }
        buildsnruines.setOnClickListener{
            Intent(this,MainActivity2::class.java).also{
                startActivity(it)
            }
        }
        ab4.setOnClickListener{
            Intent(this,MainActivity3::class.java).also{
                startActivity(it)
            }
        }
        ab3.setOnClickListener{
            Intent(this,MainActivity4::class.java).also{
                startActivity(it)
            }
        }
        ab2.setOnClickListener{
            Intent(this,MainActivity5::class.java).also{
                startActivity(it)
            }
        }
        ab1.setOnClickListener{
            Intent(this,MainActivity6::class.java).also{
                startActivity(it)
            }
        }
        profilep.setOnClickListener{
            Intent(this,MainActivity7::class.java).also{
                startActivity(it)
            }
        }
        storiestitle.setOnClickListener{
            Intent(this,MainActivity8::class.java).also{
                startActivity(it)
            }
        }
    }
}