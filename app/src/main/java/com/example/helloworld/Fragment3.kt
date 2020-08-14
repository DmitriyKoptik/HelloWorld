package com.example.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_3.*

data class Movie(val title: String, val year: Int)

class Fragment3 : Fragment() {

    private val mTarkovskyMovies = listOf(
        Movie("Убийцы", 1956),
        Movie("Сегодня увольнения не будет…", 1958),
        Movie("Каток и скрипка", 1960),
        Movie("Иваново детство", 1962),
        Movie("Мне двадцать лет («Застава Ильича»)", 1965),
        Movie("Андрей Рублёв", 1966),
        Movie("Сергей Лазо", 1967),
        Movie("Один шанс из тысячи", 1968),
        Movie("Ташкент — город хлебный", 1968),
        Movie("Конец атамана", 1971),
        Movie("Солярис", 1972),
        Movie("Терпкий виноград («Давильня»)", 1973),
        Movie("Лютый", 1973),
        Movie("Зеркало", 1974),
        Movie("Сталкер", 1979),
        Movie("Берегись! Змеи!", 1979),
        Movie("Время путешествия", 1982),
        Movie("Ностальгия", 1983),
        Movie("Путь к Брессону", 1983),
        Movie("Жертвоприношение", 1986)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = Task4Activity.ListAdapter(mTarkovskyMovies)
        }

    }

}