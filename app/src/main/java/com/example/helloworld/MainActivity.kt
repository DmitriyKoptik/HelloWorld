package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var textView:TextView
    private lateinit var textView2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonMain)
        textView = findViewById<TextView>(R.id.textViewMain)
        textView2 = findViewById<TextView>(R.id.textViewMain2)

        // сделать имплемент OnClickListener на текущую активити
        button.setOnClickListener(this)

        // анонимный класс
        textViewMain.setOnClickListener() {
           val messageTemp = textViewMain.getText().toString()
           textViewMain.setText(textViewMain2.getText().toString())
           textViewMain2.setText(messageTemp)

           val colorTemp = textViewMain.getBackground()
           textViewMain.setBackground(textViewMain2.getBackground())
           textViewMain2.setBackground(colorTemp)
        }



    }

    override fun onClick(v: View?) {
        val messageTemp = textViewMain.getText().toString()
        textView.setText(textViewMain2.getText().toString())
        textView2.setText(messageTemp)

        val colorTemp = textViewMain.getBackground()
        textView.setBackground(textViewMain2.getBackground())
        textView2.setBackground(colorTemp)
    }

        // layout xml
    fun clickResponse(view: View) {
        val messageTemp = textViewMain.getText().toString()
        textViewMain.setText(textViewMain2.getText().toString())
        textViewMain2.setText(messageTemp)

        val colorTemp = textViewMain.getBackground()
        textViewMain.setBackground(textViewMain2.getBackground())
        textViewMain2.setBackground(colorTemp)
    }
}



