package com.cherlan.leakcanary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnGoSecond: Button

    companion object{
        var context: Context? = null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(context == null){
            context = this
        }

        btnGoSecond = findViewById(R.id.btnGoSecond)

        btnGoSecond.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", "value")
            startActivity(intent)
        }
    }
}