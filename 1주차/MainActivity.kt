package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter=0
        val Buttontext=findViewById<Button>(R.id.button)

        Buttontext.setOnClickListener{
            counter++
            Buttontext.text="Test $counter"
        }
    }
}
