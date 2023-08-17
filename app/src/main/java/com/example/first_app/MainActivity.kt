package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("hs","onCreate")
    }
    override fun onStart() {
        super.onStart()
        counter = 5 + 6
        Log.d("hs","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("hs","onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("hs","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("hs","onDestroy")
    }

}