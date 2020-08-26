package com.example.helloworld.Task6

import android.content.Context
import android.content.SharedPreferences

class SharedPreference(val context: Context) {
    private var MODE_PRIVATE = 0
    private val PREF_NAME = "user-login-data"
    val sharedPref: SharedPreferences = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE)

    fun save(KEY_NAME: String, value: Int) {
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.putInt(KEY_NAME, value)
        editor.apply()
    }

    fun getValueString(KEY_NAME: String): String? {
        return sharedPref.getString(KEY_NAME, null)
    }

    fun clearSharedPreference() {
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.clear()
        editor.apply()
    }

    fun removeValue(KEY_NAME: String) {
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.remove(KEY_NAME)
        editor.apply()
    }
}