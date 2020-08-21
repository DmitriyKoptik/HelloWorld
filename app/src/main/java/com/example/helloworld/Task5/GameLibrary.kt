package com.example.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_game_library.*

class GameLibrary : Fragment() {

    val BoardGameList = listOf(
        GameDetailsMode("Мы играем в шахматы", "https://www.kindpng.com/picc/m/97-971076_chessboard-png-clip-art-chess-3d-model-free.png"),
        GameDetailsMode("Мы играем в нарды", "https://pngimg.com/uploads/backgammon/backgammon_PNG9.png"),
        GameDetailsMode("Мы играем в шоги", "https://cache.natureetdecouvertes.com/Medias/Images/Articles/91302080/69")
    )

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_game_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonGame1.setOnClickListener {
            val action = GameLibraryDirections.gotoGameDetails(BoardGameList[0])
            findNavController().navigate(action)
        }

        buttonGame2.setOnClickListener {
            val action = GameLibraryDirections.gotoGameDetails(BoardGameList[1])
            findNavController().navigate(action)
        }

        buttonGame3.setOnClickListener {
            val action = GameLibraryDirections.gotoGameDetails(BoardGameList[2])
            findNavController().navigate(action)
        }

    }
}

