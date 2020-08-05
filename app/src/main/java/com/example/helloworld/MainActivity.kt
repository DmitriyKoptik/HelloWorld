package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // setOnClickListener на текущую активити
        buttonMain.setOnClickListener() {
            val messageTemp = textViewMain.getText().toString()
            textViewMain.setText(textViewMain2.getText().toString())
            textViewMain2.setText(messageTemp)

            val colorTemp = textViewMain.getBackground()
            textViewMain.setBackground(textViewMain2.getBackground())
            textViewMain2.setBackground(colorTemp)
        }

        // анонимный класс. Тут я словил проблему с unresolved reference
       textViewMain.setOnClickListener(new View.OnClickListener() {
            fun onClick(View v) {
                String messageTemp = textViewMain.getText().toString()
                textViewMain.setText(textViewMain2.getText().toString())
                textViewMain2.setText(messageTemp)

                String colorTemp = textViewMain.getBackground()
                textViewMain.setBackground(textViewMain2.getBackground())
                textViewMain2.setBackground(colorTemp)
           })

           // Из-за прошлого варика до layouta не добрался, пока оставил только первую имплементацию
        textViewMain2.setOnClickListener() {
            val messageTemp = textViewMain.getText().toString()
            textViewMain.setText(textViewMain2.getText().toString())
            textViewMain2.setText(messageTemp)

            val colorTemp = textViewMain.getBackground()
            textViewMain.setBackground(textViewMain2.getBackground())
            textViewMain2.setBackground(colorTemp)
        }

    }



}