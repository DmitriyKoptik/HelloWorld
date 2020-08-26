package com.example.helloworld.Task6

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_task6.*

class Task6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task6)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }
}