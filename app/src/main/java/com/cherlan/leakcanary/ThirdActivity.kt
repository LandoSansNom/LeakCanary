package com.cherlan.leakcanary

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {
    private var mainActivity: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        mainActivity = MainActivity.context
        Log.d("contextMain", mainActivity.toString())

    }
}