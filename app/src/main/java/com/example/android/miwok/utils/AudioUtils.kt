package com.example.android.miwok.utils

import android.content.Context
import android.media.MediaPlayer

class AudioUtils {
    companion object {
        fun playAudio(context: Context, file: Int) {
            MediaPlayer.create(context, file).apply {
                setOnCompletionListener { player ->
                    player.release()
                }
                start()
            }
        }
    }
}