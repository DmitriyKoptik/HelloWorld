package com.example.helloworld.Task6

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.helloworld.R
import kotlinx.android.synthetic.main.fragment_login.*

class Login : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonfinishLogin.setOnClickListener {
            val sharedPreferences: SharedPreferences = this.requireActivity().getSharedPreferences("USER_LOGIN_DATA", Context.MODE_PRIVATE)

            val name = userblock.text.toString()
            val password = passwordblock.text.toString().trim()

            val nameConfirm = (sharedPreferences.getString("NAME", "") == name)

            if (nameConfirm) {
                if (sharedPreferences.getString("PASSWORD", "") == password){
                    findNavController().navigate(R.id.loginResult)
                } else {
                    Toast.makeText(this.activity, "Проверьте, чтобы пароль был указан верно", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this.activity, "Проверьте, чтобы имя пользователя было указано верно", Toast.LENGTH_SHORT).show()
            }
        }
    }

}