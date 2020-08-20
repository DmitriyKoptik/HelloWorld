package com.example.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_nav0.*

class Nav0 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        button_game1_choice.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.nav1))
        button_game2_choice.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.nav2))
        button_game3_choice.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.nav3))
        button_game4_choice.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.nav4))
        button_game5_choice.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.nav5))

        return inflater.inflate(R.layout.fragment_nav0, container, false)
    }

}
