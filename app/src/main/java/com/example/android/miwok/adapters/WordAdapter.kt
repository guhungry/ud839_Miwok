package com.example.android.miwok.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.android.miwok.R
import com.example.android.miwok.models.Word
import kotlinx.android.synthetic.main.word_list_item.view.*

class WordAdapter(context: Context, list: ArrayList<Word>? = null): ArrayAdapter<Word>(context, R.layout.word_list_item, list) {
    val inflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = if (convertView != null) convertView else inflater.inflate(R.layout.word_list_item, parent, false)
        val item = getItem(position)

        view.english.text = item.english
        return view
    }
}