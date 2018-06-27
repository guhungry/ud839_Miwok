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
                Word(default = "father", miwok = "әpә", image = R.drawable.family_father, audio = R.raw.family_father),
                Word(default = "mother", miwok = "әṭa", image = R.drawable.family_mother, audio = R.raw.family_mother),
                Word(default = "son", miwok = "angsi", image = R.drawable.family_son, audio = R.raw.family_son),
                Word(default = "daughter", miwok = "tune", image = R.drawable.family_daughter, audio = R.raw.family_daughter),
                Word(default = "older brother", miwok = "taachi", image = R.drawable.family_older_brother, audio = R.raw.family_older_brother),
                Word(default = "younger brother", miwok = "chalitti", image = R.drawable.family_younger_brother, audio = R.raw.family_younger_brother),
                Word(default = "older sister", miwok = "teṭe", image = R.drawable.family_older_sister, audio = R.raw.family_older_sister),
                Word(default = "younger sister", miwok = "kolliti", image = R.drawable.family_younger_sister, audio = R.raw.family_younger_sister),
                Word(default = "grandmother", miwok = "ama", image = R.drawable.family_grandmother, audio = R.raw.family_grandmother),
                Word(default = "grandfather", miwok = "paapa", image = R.drawable.family_grandfather, audio = R.raw.family_grandfather)
        )
    }
}
