package com.example.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager


class Task4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task4)
        val adapter = MyAdapter(supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.viewpager)
        viewPager.adapter = adapter
        viewPager.currentItem = 1
    }

    class MyAdapter internal constructor(fm: FragmentManager) :
        FragmentPagerAdapter(fm) {
        override fun getCount(): Int {
            return 3
        }

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> Fragment1()
                1 -> Fragment2()
                2 -> Fragment3()
                else -> Fragment1()
            }
        }
    }

    class ListAdapter(private val list: List<Movie>)
        : RecyclerView.Adapter<MovieViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return MovieViewHolder(inflater, parent)
        }

        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            val movie: Movie = list[position]
            holder.bind(movie)
        }

        override fun getItemCount(): Int = list.size

    }

    class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.fragment_3listelements, parent, false)) {
        private var mTitleView: TextView? = null
        private var mYearView: TextView? = null


        init {
            mTitleView = itemView.findViewById(R.id.list_title)
            mYearView = itemView.findViewById(R.id.list_description)
        }

        fun bind(movie: Movie) {
            mTitleView?.text = movie.title
            mYearView?.text = movie.year.toString()
        }

    }
}