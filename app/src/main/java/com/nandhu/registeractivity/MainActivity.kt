package com.nandhu.registeractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linkSetup()

        var btnNext = findViewById<Button>(R.id.logButton)
        btnNext.setOnClickListener {

            var Intent =Intent(this, Registration::class.java)
            startActivity(Intent)
        }








    }

    private fun linkSetup(){

//        val registorLink = Link("Don't have account").setCol


    }
}