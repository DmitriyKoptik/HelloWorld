package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView;
import kotlinx.android.synthetic.main.activity_task3.*
import com.bumptech.glide.Glide

class Task3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)
        Glide
            .with(this)
            .load(R.drawable.door)
            .error(R.drawable.error)
            .into(imageView);

        buttonBack.setOnClickListener() {
            onBackPressed()
        }

        button.setOnClickListener() {
            val editText = editText.text.toString()
            Glide
                .with(this)
                .load(editText)
                .error(R.drawable.error)
                .into(imageView);
        }
    }
}