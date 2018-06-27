package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.miwok.adapters.WordAdapter
import com.example.android.miwok.models.Word
import kotlinx.android.synthetic.main.activity_numbers.*

class PhrasesActivity : AppCompatActivity() {
    val list = wordList()
    var adapter: WordAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrases)

        setupListWord()
    }

    private fun setupListWord() {
        adapter = WordAdapter(this, list)

        list_word.adapter = adapter
    }

    private fun wordList(): ArrayList<Word> {
        return arrayListOf(
                Word(default = "Where are you going?", miwok = "minto wuksus"),
                Word(default = "What is your name?", miwok = "tinnә oyaase'nә"),
                Word(default = "My name is...", miwok = "oyaaset..."),
                Word(default = "How are you feeling?", miwok = "michәksәs?"),
                Word(default = "I’m feeling good.", miwok = "kuchi achit"),
                Word(default = "Are you coming?", miwok = "әәnәs'aa?"),
                Word(default = "Yes, I’m coming.", miwok = "hәә’ әәnәm"),
                Word(default = "I’m coming.", miwok = "әәnәm"),
                Word(default = "Let’s go.", miwok = "yoowutis"),
                Word(default = "Come here.", miwok = "әnni'nem")
        )
    }
}
