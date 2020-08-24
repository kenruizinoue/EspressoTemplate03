package com.kenruizinoue.espressotemplate03

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(inflatedView: View) :
    RecyclerView.ViewHolder(inflatedView), View.OnClickListener {

    private lateinit var label: String

    init {
        inflatedView.setOnClickListener(this)
    }


    var mTextView: TextView = this.itemView.findViewById(R.id.itemTextView)

    fun bind(label: String) {
        this.label = label
        mTextView.text = label
    }

    override fun onClick(view: View?) {
        val context = this.itemView.context
        val showDetailIntent = Intent(context, DetailActivity::class.java)
        showDetailIntent.putExtra("EXTRA", this.label)
        context.startActivity(showDetailIntent)
    }
}