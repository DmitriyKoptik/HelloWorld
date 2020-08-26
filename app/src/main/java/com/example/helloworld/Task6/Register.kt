package com.example.helloworld.Task6

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.helloworld.R
import kotlinx.android.synthetic.main.fragment_register.*

class Register : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonFinishRegister.setOnClickListener {
            val sharedPreferences: SharedPreferences = this.requireActivity().getSharedPreferences("USER_LOGIN_DATA", Context.MODE_PRIVATE)

            val name = userblock.text.toString()
            val password = passwordblock.text.toString()
            val passwordconfirm = passwordconfirmblock.text.toString()

            if (password == passwordconfirm) {
                val editor = sharedPreferences.edit()

                editor.putString("NAME", name)
                editor.putString("PASSWORD", password)

                editor.apply()

                findNavController().navigate(R.id.loginResult)
            } else {
                Toast.makeText(this.getActivity(), "Проверьте, чтобы оба пароля совпадали", Toast.LENGTH_SHORT).show()
            }
        }
    }

}