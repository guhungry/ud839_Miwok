package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.miwok.adapters.WordAdapter
import com.example.android.miwok.models.Word
import kotlinx.android.synthetic.main.activity_numbers.*

class NumbersActivity : AppCompatActivity() {
    val list = wordList()
    var adapter: WordAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        setupListWord()
    }

    private fun setupListWord() {
        adapter = WordAdapter(this, list)

        list_word.adapter = adapter
    }

    private fun wordList(): ArrayList<Word> {
        return arrayListOf(
                Word(default = "one", miwok = "lutti"),
                Word(default = "two", miwok = "otiiko"),
                Word(default = "three", miwok = "tolookosu"),
                Word(default = "four", miwok = "oyyisa"),
                Word(default = "five", miwok = "massokka"),
                Word(default = "six", miwok = "temmokka"),
                Word(default = "seven", miwok = "kenekaku"),
                Word(default = "eight", miwok = "kawinta"),
                Word(default = "nine", miwok = "wo’e"),
                Word(default = "ten", miwok = "na’aacha")
        )
    }
}
