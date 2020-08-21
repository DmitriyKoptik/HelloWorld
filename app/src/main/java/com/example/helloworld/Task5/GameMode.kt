package com.example.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_game_mode.*

class GameMode : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.fragment_game_mode, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textnav.setText(GameModeArgs.fromBundle(requireArguments()).gameDetailsMode.title)

        Glide
            .with(this)
            .load(GameModeArgs.fromBundle(requireArguments()).gameDetailsMode.img)
            .error(R.drawable.error)
            .into(imageGame)

        textnavback.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goto_home_action)
        }
    }
}
