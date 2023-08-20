package com.example.first_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.first_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    val a = 20
    val b = 20
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btn1.setOnClickListener {
            val result = a + b
            bindingClass.textView2.visibility = View.VISIBLE
            bindingClass.textView2.text = "Результат: ${result.toString()}"
        }

        bindingClass.btn2.setOnClickListener {
            val result = a - b
            bindingClass.textView2.visibility = View.VISIBLE
            bindingClass.textView2.text = "Результат: ${result.toString()}"
        }

        bindingClass.btn3.setOnClickListener {
            val result = a * b
            bindingClass.textView2.visibility = View.VISIBLE
            bindingClass.textView2.text = "Результат: ${result.toString()}"
        }
    }
    
}