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
                Word(default = "one", miwok = "lutti", image = R.drawable.number_one, audio = R.raw.number_one),
                Word(default = "two", miwok = "otiiko", image = R.drawable.number_two, audio = R.raw.number_two),
                Word(default = "three", miwok = "tolookosu", image = R.drawable.number_three, audio = R.raw.number_three),
                Word(default = "four", miwok = "oyyisa", image = R.drawable.number_four, audio = R.raw.number_four),
                Word(default = "five", miwok = "massokka", image = R.drawable.number_five, audio = R.raw.number_five),
                Word(default = "six", miwok = "temmokka", image = R.drawable.number_six, audio = R.raw.number_six),
                Word(default = "seven", miwok = "kenekaku", image = R.drawable.number_seven, audio = R.raw.number_seven),
                Word(default = "eight", miwok = "kawinta", image = R.drawable.number_eight, audio = R.raw.number_eight),
                Word(default = "nine", miwok = "wo’e", image = R.drawable.number_nine, audio = R.raw.number_nine),
                Word(default = "ten", miwok = "na’aacha", image = R.drawable.number_ten, audio = R.raw.number_ten)
        )
    }
}
