package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTask1.setOnClickListener() {
            val intent1 = Intent(this, Task1Activity::class.java)
            startActivityForResult(intent1, 12)
        }


        buttonTask2.setOnClickListener() {
            val intent2 = Intent(this, Task2Activity::class.java)
            startActivityForResult(intent2, 12)
        }
    }
}







