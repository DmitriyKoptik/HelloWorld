package com.example.helloworld.Task6

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.helloworld.R
import kotlinx.android.synthetic.main.fragment_login_result.*

class LoginResult : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_login_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPreferences: SharedPreferences = this.requireActivity().getSharedPreferences("USER_LOGIN_DATA", Context.MODE_PRIVATE)

        val name = sharedPreferences.getString("NAME", "")

        login_info.text = name

        quit_account_button.setOnClickListener {
            findNavController().navigate(R.id.loginRegistrationScreen)
        }
    }

}