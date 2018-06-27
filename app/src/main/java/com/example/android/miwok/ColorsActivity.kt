package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.miwok.adapters.WordAdapter
import com.example.android.miwok.models.Word
import com.example.android.miwok.utils.AudioUtils
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
        list_word.setOnItemClickListener { adapter, view, position, id ->
            val item = adapter.getItemAtPosition(position) as Word

            AudioUtils.playAudio(this@ColorsActivity, audioManager(), item.audio)
        }
    }

    override fun onStop() {
        AudioUtils.releaseAudio()

        super.onStop()
    }

    private fun wordList(): ArrayList<Word> {
        return arrayListOf(
                Word(default = "red", miwok = "weṭeṭṭi", image = R.drawable.color_red, audio = R.raw.color_red),
                Word(default = "green", miwok = "chokokki", image = R.drawable.color_green, audio = R.raw.color_green),
                Word(default = "brown", miwok = "ṭakaakki", image = R.drawable.color_brown, audio = R.raw.color_brown),
                Word(default = "gray", miwok = "ṭopoppi", image = R.drawable.color_gray, audio = R.raw.color_gray),
                Word(default = "black", miwok = "kululli", image = R.drawable.color_black, audio = R.raw.color_black),
                Word(default = "white", miwok = "kelelli", image = R.drawable.color_white, audio = R.raw.color_white),
                Word(default = "dusty yellow", miwok = "ṭopiisә", image = R.drawable.color_dusty_yellow, audio = R.raw.color_dusty_yellow),
                Word(default = "mustard yellow", miwok = "chiwiiṭә", image = R.drawable.color_mustard_yellow, audio = R.raw.color_mustard_yellow)
        )
    }
}
