package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.miwok.adapters.WordAdapter
import com.example.android.miwok.models.Word
import kotlinx.android.synthetic.main.activity_numbers.*

class FamilyActivity : AppCompatActivity() {
    val list = wordList()
    var adapter: WordAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)

        setupListWord()
    }

    private fun setupListWord() {
        adapter = WordAdapter(this, list)

        list_word.adapter = adapter
    }

    private fun wordList(): ArrayList<Word> {
        return arrayListOf(
                Word(default = "father", miwok = "әpә"),
                Word(default = "mother", miwok = "әṭa"),
                Word(default = "son", miwok = "angsi"),
                Word(default = "daughter", miwok = "tune"),
                Word(default = "older brother", miwok = "taachi"),
                Word(default = "younger brother", miwok = "chalitti"),
                Word(default = "older sister", miwok = "teṭe"),
                Word(default = "younger sister", miwok = "kolliti"),
                Word(default = "grandmother", miwok = "ama"),
                Word(default = "grandfather", miwok = "paapa")
        )
    }
}
