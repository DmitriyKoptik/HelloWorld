package com.example.helloworld.Task6

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helloworld.R
import kotlinx.android.synthetic.main.fragment_login_registration.*

class LoginRegistrationScreen : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_login_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin.setOnClickListener{
              Navigation.findNavController(it).navigate(R.id.goto_login)
        }

        buttonRegister.setOnClickListener{
              Navigation.findNavController(it).navigate(R.id.goto_register)
        }
    }

}