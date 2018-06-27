package com.example.android.miwok.utils

import android.content.Context
import android.media.MediaPlayer

class AudioUtils {
    companion object {
        private var player: MediaPlayer? = null

        fun playAudio(context: Context, file: Int) {
            releaseAudio()
            player = MediaPlayer.create(context, file).apply {
                setOnCompletionListener { player ->
                    releaseAudio()
                }
                start()
            }
        }

        private fun releaseAudio() {
            player?.release()
            player = null
        }
    }
}