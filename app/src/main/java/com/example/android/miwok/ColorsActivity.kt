package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.miwok.adapters.WordAdapter
import com.example.android.miwok.models.Word
import kotlinx.android.synthetic.main.activity_numbers.*

class ColorsActivity : AppCompatActivity() {
    val list = wordList()
    var adapter: WordAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

        setupListWord()
    }

    private fun setupListWord() {
        adapter = WordAdapter(this, list)

        list_word.adapter = adapter
    }

    private fun wordList(): ArrayList<Word> {
        return arrayListOf(
                Word(default = "red", miwok = "weṭeṭṭi"),
                Word(default = "green", miwok = "chokokki"),
                Word(default = "brown", miwok = "ṭakaakki"),
                Word(default = "gray", miwok = "ṭopoppi"),
                Word(default = "black", miwok = "kululli"),
                Word(default = "white", miwok = "kelelli"),
                Word(default = "dusty yellow", miwok = "ṭopiisә"),
                Word(default = "mustard yellow", miwok = "chiwiiṭә")
        )
    }
}
