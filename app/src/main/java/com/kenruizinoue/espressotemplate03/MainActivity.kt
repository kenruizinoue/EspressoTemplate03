package com.kenruizinoue.espressotemplate03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myAdapter = MyAdapter(data)
        myRecyclerView.apply {
            adapter = myAdapter
        }
        myRecyclerView.addItemDecoration(
            DividerItemDecoration(
                myRecyclerView.context,
                DividerItemDecoration.VERTICAL
            )
        )
    }
}