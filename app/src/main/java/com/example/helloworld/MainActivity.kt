package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.Task6.Task6Activity
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


        buttonTask3.setOnClickListener() {
            val intent3 = Intent(this, Task3Activity::class.java)
            startActivityForResult(intent3, 12)
        }


        buttonTask4.setOnClickListener() {
            val intent4 = Intent(this, Task4Activity::class.java)
            startActivityForResult(intent4, 12)
        }


        buttonTask5.setOnClickListener() {
            val intent5 = Intent(this, Task5Activity::class.java)
            startActivityForResult(intent5, 12)
        }

        buttonTask6.setOnClickListener() {
            val intent6 = Intent(this, Task6Activity::class.java)
            startActivityForResult(intent6, 12)
        }
    }
}







