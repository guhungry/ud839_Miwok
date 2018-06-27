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
                Word(english = "one", miwok = "lutti"),
                Word(english = "two"),
                Word(english = "three"),
                Word(english = "four"),
                Word(english = "five"),
                Word(english = "six"),
                Word(english = "seven"),
                Word(english = "eight"),
                Word(english = "nine"),
                Word(english = "ten")
        )
    }
}
