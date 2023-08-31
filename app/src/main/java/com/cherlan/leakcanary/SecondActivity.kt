package com.cherlan.leakcanary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    private lateinit var btnGoSecond: Button
    private var mainActivity: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mainActivity = MainActivity.context

        btnGoSecond = findViewById(R.id.btnGoSecond)

        btnGoSecond.setOnClickListener {

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("key", "value")
            mainActivity?.startActivity(intent)
        }

    }
}