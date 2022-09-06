package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment  = FirstFragment()
        val secondFragment = SecondFragment()

        var btnFragment1 = findViewById<Button>(R.id.btnFragment1)
        var btnFragment2 = findViewById<Button>(R.id.btnFragment2)

        // initial fragment is the first one
        supportFragmentManager.beginTransaction().apply{
        replace(R.id.Flfragment,firstFragment)
            commit()
        }

        btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.Flfragment,firstFragment)
                addToBackStack(null)
                commit()

            }
        }

        btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.Flfragment,secondFragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}