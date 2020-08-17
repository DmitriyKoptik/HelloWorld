package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_task1.*

class Task1Activity : AppCompatActivity(), View.OnClickListener {
    private lateinit var textView: TextView
    private lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)

        buttonBack.setOnClickListener() {
            onBackPressed()
        }

        val button = findViewById<Button>(R.id.buttonMain)
        textView = findViewById<TextView>(R.id.textViewMain)
        textView2 = findViewById<TextView>(R.id.textViewMain2)

        // сделать имплемент OnClickListener на текущую активити
        button.setOnClickListener(this)

        // анонимный класс
        textViewMain.setOnClickListener() {
            swap()
        }
    }

    override fun onClick(v: View?) {
        swap()
    }

    // layout xml
    fun clickResponse(view: View) {
        swap()
    }
    // Повторявшийся кусок кода с разменом текстами и цветом фона
    fun swap() {
        val messageTemp = textViewMain.getText().toString()
        textViewMain.setText(textViewMain2.getText().toString())
        textViewMain2.setText(messageTemp)

        val colorTemp = textViewMain.getBackground()
        textViewMain.setBackground(textViewMain2.getBackground())
        textViewMain2.setBackground(colorTemp)
    }
}
/* Оставлю эти две под комментарием
fun swapText() {
    val messageTemp = textViewMain.getText().toString()
    textViewMain.setText(textViewMain2.getText().toString())
    textViewMain2.setText(messageTemp)
}


fun swapBackgroundColor() {
    val colorTemp = textViewMain.getBackground()
    textViewMain.setBackground(textViewMain2.getBackground())
    textViewMain2.setBackground(colorTemp)
}*/