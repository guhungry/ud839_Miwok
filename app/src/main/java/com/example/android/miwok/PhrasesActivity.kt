package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.miwok.adapters.WordAdapter
import com.example.android.miwok.models.Word
import com.example.android.miwok.utils.AudioUtils
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
        list_word.setOnItemClickListener { adapter, view, position, id ->
            val item = adapter.getItemAtPosition(position) as Word

            AudioUtils.playAudio(this@PhrasesActivity, item.audio)
        }
    }

    override fun onStop() {
        AudioUtils.releaseAudio()

        super.onStop()
    }

    private fun wordList(): ArrayList<Word> {
        return arrayListOf(
                Word(default = "Where are you going?", miwok = "minto wuksus", audio = R.raw.phrase_where_are_you_going),
                Word(default = "What is your name?", miwok = "tinnә oyaase'nә", audio = R.raw.phrase_what_is_your_name),
                Word(default = "My name is...", miwok = "oyaaset...", audio = R.raw.phrase_my_name_is),
                Word(default = "How are you feeling?", miwok = "michәksәs?", audio = R.raw.phrase_how_are_you_feeling),
                Word(default = "I’m feeling good.", miwok = "kuchi achit", audio = R.raw.phrase_im_feeling_good),
                Word(default = "Are you coming?", miwok = "әәnәs'aa?", audio = R.raw.phrase_are_you_coming),
                Word(default = "Yes, I’m coming.", miwok = "hәә’ әәnәm", audio = R.raw.phrase_yes_im_coming),
                Word(default = "I’m coming.", miwok = "әәnәm", audio = R.raw.phrase_im_coming),
                Word(default = "Let’s go.", miwok = "yoowutis", audio = R.raw.phrase_lets_go),
                Word(default = "Come here.", miwok = "әnni'nem", audio = R.raw.phrase_come_here)
        )
    }
}
